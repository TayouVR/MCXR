/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jetbrains.annotations.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.*;

import java.nio.ByteBuffer;

import static org.lwjgl.system.Checks.check;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorPersistenceInfoMSFT {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrSpatialAnchorPersistenceNameMSFT XrSpatialAnchorPersistenceNameMSFT} spatialAnchorPersistenceName;
 *     XrSpatialAnchorMSFT spatialAnchor;
 * }</code></pre>
 */
public class XrSpatialAnchorPersistenceInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPATIALANCHORPERSISTENCENAME,
        SPATIALANCHOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrSpatialAnchorPersistenceNameMSFT.SIZEOF, XrSpatialAnchorPersistenceNameMSFT.ALIGNOF),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPATIALANCHORPERSISTENCENAME = layout.offsetof(2);
        SPATIALANCHOR = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSpatialAnchorPersistenceInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorPersistenceInfoMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return a {@link XrSpatialAnchorPersistenceNameMSFT} view of the {@code spatialAnchorPersistenceName} field. */
    public XrSpatialAnchorPersistenceNameMSFT spatialAnchorPersistenceName() { return nspatialAnchorPersistenceName(address()); }
    /** @return the value of the {@code spatialAnchor} field. */
    @NativeType("XrSpatialAnchorMSFT")
    public long spatialAnchor() { return nspatialAnchor(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorPersistenceInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSpatialAnchorPersistence#XR_TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT} value to the {@code type} field. */
    public XrSpatialAnchorPersistenceInfoMSFT type$Default() { return type(MSFTSpatialAnchorPersistence.XR_TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorPersistenceInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrSpatialAnchorPersistenceNameMSFT} to the {@code spatialAnchorPersistenceName} field. */
    public XrSpatialAnchorPersistenceInfoMSFT spatialAnchorPersistenceName(XrSpatialAnchorPersistenceNameMSFT value) { nspatialAnchorPersistenceName(address(), value); return this; }
    /** Passes the {@code spatialAnchorPersistenceName} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialAnchorPersistenceInfoMSFT spatialAnchorPersistenceName(java.util.function.Consumer<XrSpatialAnchorPersistenceNameMSFT> consumer) { consumer.accept(spatialAnchorPersistenceName()); return this; }
    /** Sets the specified value to the {@code spatialAnchor} field. */
    public XrSpatialAnchorPersistenceInfoMSFT spatialAnchor(XrSpatialAnchorMSFT value) { nspatialAnchor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorPersistenceInfoMSFT set(
        int type,
        long next,
        XrSpatialAnchorPersistenceNameMSFT spatialAnchorPersistenceName,
        XrSpatialAnchorMSFT spatialAnchor
    ) {
        type(type);
        next(next);
        spatialAnchorPersistenceName(spatialAnchorPersistenceName);
        spatialAnchor(spatialAnchor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorPersistenceInfoMSFT set(XrSpatialAnchorPersistenceInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorPersistenceInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorPersistenceInfoMSFT malloc() {
        return wrap(XrSpatialAnchorPersistenceInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSpatialAnchorPersistenceInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorPersistenceInfoMSFT calloc() {
        return wrap(XrSpatialAnchorPersistenceInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSpatialAnchorPersistenceInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorPersistenceInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSpatialAnchorPersistenceInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorPersistenceInfoMSFT} instance for the specified memory address. */
    public static XrSpatialAnchorPersistenceInfoMSFT create(long address) {
        return wrap(XrSpatialAnchorPersistenceInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorPersistenceInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSpatialAnchorPersistenceInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorPersistenceInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code XrSpatialAnchorPersistenceInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorPersistenceInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrSpatialAnchorPersistenceInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSpatialAnchorPersistenceInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorPersistenceInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrSpatialAnchorPersistenceInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorPersistenceInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorPersistenceInfoMSFT.NEXT); }
    /** Unsafe version of {@link #spatialAnchorPersistenceName}. */
    public static XrSpatialAnchorPersistenceNameMSFT nspatialAnchorPersistenceName(long struct) { return XrSpatialAnchorPersistenceNameMSFT.create(struct + XrSpatialAnchorPersistenceInfoMSFT.SPATIALANCHORPERSISTENCENAME); }
    /** Unsafe version of {@link #spatialAnchor}. */
    public static long nspatialAnchor(long struct) { return memGetAddress(struct + XrSpatialAnchorPersistenceInfoMSFT.SPATIALANCHOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorPersistenceInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorPersistenceInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #spatialAnchorPersistenceName(XrSpatialAnchorPersistenceNameMSFT) spatialAnchorPersistenceName}. */
    public static void nspatialAnchorPersistenceName(long struct, XrSpatialAnchorPersistenceNameMSFT value) { memCopy(value.address(), struct + XrSpatialAnchorPersistenceInfoMSFT.SPATIALANCHORPERSISTENCENAME, XrSpatialAnchorPersistenceNameMSFT.SIZEOF); }
    /** Unsafe version of {@link #spatialAnchor(XrSpatialAnchorMSFT) spatialAnchor}. */
    public static void nspatialAnchor(long struct, XrSpatialAnchorMSFT value) { memPutAddress(struct + XrSpatialAnchorPersistenceInfoMSFT.SPATIALANCHOR, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorPersistenceInfoMSFT.SPATIALANCHOR));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorPersistenceInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorPersistenceInfoMSFT, Buffer> implements NativeResource {

        private static final XrSpatialAnchorPersistenceInfoMSFT ELEMENT_FACTORY = XrSpatialAnchorPersistenceInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorPersistenceInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorPersistenceInfoMSFT#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected XrSpatialAnchorPersistenceInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorPersistenceInfoMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorPersistenceInfoMSFT.nnext(address()); }
        /** @return a {@link XrSpatialAnchorPersistenceNameMSFT} view of the {@code spatialAnchorPersistenceName} field. */
        public XrSpatialAnchorPersistenceNameMSFT spatialAnchorPersistenceName() { return XrSpatialAnchorPersistenceInfoMSFT.nspatialAnchorPersistenceName(address()); }
        /** @return the value of the {@code spatialAnchor} field. */
        @NativeType("XrSpatialAnchorMSFT")
        public long spatialAnchor() { return XrSpatialAnchorPersistenceInfoMSFT.nspatialAnchor(address()); }

        /** Sets the specified value to the {@code type} field. */
        public Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorPersistenceInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSpatialAnchorPersistence#XR_TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT} value to the {@code type} field. */
        public Buffer type$Default() { return type(MSFTSpatialAnchorPersistence.XR_TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorPersistenceInfoMSFT.nnext(address(), value); return this; }
        /** Copies the specified {@link XrSpatialAnchorPersistenceNameMSFT} to the {@code spatialAnchorPersistenceName} field. */
        public Buffer spatialAnchorPersistenceName(XrSpatialAnchorPersistenceNameMSFT value) { XrSpatialAnchorPersistenceInfoMSFT.nspatialAnchorPersistenceName(address(), value); return this; }
        /** Passes the {@code spatialAnchorPersistenceName} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer spatialAnchorPersistenceName(java.util.function.Consumer<XrSpatialAnchorPersistenceNameMSFT> consumer) { consumer.accept(spatialAnchorPersistenceName()); return this; }
        /** Sets the specified value to the {@code spatialAnchor} field. */
        public Buffer spatialAnchor(XrSpatialAnchorMSFT value) { XrSpatialAnchorPersistenceInfoMSFT.nspatialAnchor(address(), value); return this; }

    }

}