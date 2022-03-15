#version 100

attribute vec3 Position;
attribute vec2 UV0;
attribute vec4 Color;

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;

varying vec2 texCoord0;
varying vec4 vertexColor;

void main() {
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);

    texCoord0 = UV0;
    vertexColor = Color;
}
