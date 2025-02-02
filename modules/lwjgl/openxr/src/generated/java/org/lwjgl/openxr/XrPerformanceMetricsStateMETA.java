/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Performance metrics enablement state.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrPerformanceMetricsStateMETA} is provided as input when calling {@link METAPerformanceMetrics#xrSetPerformanceMetricsStateMETA SetPerformanceMetricsStateMETA} to enable or disable the performance metrics system. {@link XrPerformanceMetricsStateMETA} is populated as an output parameter when calling {@link METAPerformanceMetrics#xrGetPerformanceMetricsStateMETA GetPerformanceMetricsStateMETA} to query the enablement status of the performance metrics system.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAPerformanceMetrics XR_META_performance_metrics} extension <b>must</b> be enabled prior to using {@link XrPerformanceMetricsStateMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAPerformanceMetrics#XR_TYPE_PERFORMANCE_METRICS_STATE_META TYPE_PERFORMANCE_METRICS_STATE_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link METAPerformanceMetrics#xrGetPerformanceMetricsStateMETA GetPerformanceMetricsStateMETA}, {@link METAPerformanceMetrics#xrSetPerformanceMetricsStateMETA SetPerformanceMetricsStateMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPerformanceMetricsStateMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrBool32 {@link #enabled};
 * }</code></pre>
 */
public class XrPerformanceMetricsStateMETA extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENABLED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ENABLED = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrPerformanceMetricsStateMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPerformanceMetricsStateMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** set to {@link XR10#XR_TRUE TRUE} to indicate the performance metrics system is enabled, {@link XR10#XR_FALSE FALSE} otherwise, when getting state. When setting state, set to {@link XR10#XR_TRUE TRUE} to enable the performance metrics system and {@link XR10#XR_FALSE FALSE} to disable it. */
    @NativeType("XrBool32")
    public boolean enabled() { return nenabled(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrPerformanceMetricsStateMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAPerformanceMetrics#XR_TYPE_PERFORMANCE_METRICS_STATE_META TYPE_PERFORMANCE_METRICS_STATE_META} value to the {@link #type} field. */
    public XrPerformanceMetricsStateMETA type$Default() { return type(METAPerformanceMetrics.XR_TYPE_PERFORMANCE_METRICS_STATE_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrPerformanceMetricsStateMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #enabled} field. */
    public XrPerformanceMetricsStateMETA enabled(@NativeType("XrBool32") boolean value) { nenabled(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrPerformanceMetricsStateMETA set(
        int type,
        long next,
        boolean enabled
    ) {
        type(type);
        next(next);
        enabled(enabled);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPerformanceMetricsStateMETA set(XrPerformanceMetricsStateMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPerformanceMetricsStateMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPerformanceMetricsStateMETA malloc() {
        return wrap(XrPerformanceMetricsStateMETA.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrPerformanceMetricsStateMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPerformanceMetricsStateMETA calloc() {
        return wrap(XrPerformanceMetricsStateMETA.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrPerformanceMetricsStateMETA} instance allocated with {@link BufferUtils}. */
    public static XrPerformanceMetricsStateMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrPerformanceMetricsStateMETA.class, memAddress(container), container);
    }

    /** Returns a new {@code XrPerformanceMetricsStateMETA} instance for the specified memory address. */
    public static XrPerformanceMetricsStateMETA create(long address) {
        return wrap(XrPerformanceMetricsStateMETA.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPerformanceMetricsStateMETA createSafe(long address) {
        return address == NULL ? null : wrap(XrPerformanceMetricsStateMETA.class, address);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsStateMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsStateMETA.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsStateMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsStateMETA.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsStateMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsStateMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrPerformanceMetricsStateMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsStateMETA.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPerformanceMetricsStateMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrPerformanceMetricsStateMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPerformanceMetricsStateMETA malloc(MemoryStack stack) {
        return wrap(XrPerformanceMetricsStateMETA.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrPerformanceMetricsStateMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPerformanceMetricsStateMETA calloc(MemoryStack stack) {
        return wrap(XrPerformanceMetricsStateMETA.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrPerformanceMetricsStateMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsStateMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPerformanceMetricsStateMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPerformanceMetricsStateMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPerformanceMetricsStateMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPerformanceMetricsStateMETA.NEXT); }
    /** Unsafe version of {@link #enabled}. */
    public static int nenabled(long struct) { return UNSAFE.getInt(null, struct + XrPerformanceMetricsStateMETA.ENABLED); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPerformanceMetricsStateMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPerformanceMetricsStateMETA.NEXT, value); }
    /** Unsafe version of {@link #enabled(boolean) enabled}. */
    public static void nenabled(long struct, int value) { UNSAFE.putInt(null, struct + XrPerformanceMetricsStateMETA.ENABLED, value); }

    // -----------------------------------

    /** An array of {@link XrPerformanceMetricsStateMETA} structs. */
    public static class Buffer extends StructBuffer<XrPerformanceMetricsStateMETA, Buffer> implements NativeResource {

        private static final XrPerformanceMetricsStateMETA ELEMENT_FACTORY = XrPerformanceMetricsStateMETA.create(-1L);

        /**
         * Creates a new {@code XrPerformanceMetricsStateMETA.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPerformanceMetricsStateMETA#SIZEOF}, and its mark will be undefined.
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
        protected XrPerformanceMetricsStateMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrPerformanceMetricsStateMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPerformanceMetricsStateMETA.ntype(address()); }
        /** @return the value of the {@link XrPerformanceMetricsStateMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrPerformanceMetricsStateMETA.nnext(address()); }
        /** @return the value of the {@link XrPerformanceMetricsStateMETA#enabled} field. */
        @NativeType("XrBool32")
        public boolean enabled() { return XrPerformanceMetricsStateMETA.nenabled(address()) != 0; }

        /** Sets the specified value to the {@link XrPerformanceMetricsStateMETA#type} field. */
        public XrPerformanceMetricsStateMETA.Buffer type(@NativeType("XrStructureType") int value) { XrPerformanceMetricsStateMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAPerformanceMetrics#XR_TYPE_PERFORMANCE_METRICS_STATE_META TYPE_PERFORMANCE_METRICS_STATE_META} value to the {@link XrPerformanceMetricsStateMETA#type} field. */
        public XrPerformanceMetricsStateMETA.Buffer type$Default() { return type(METAPerformanceMetrics.XR_TYPE_PERFORMANCE_METRICS_STATE_META); }
        /** Sets the specified value to the {@link XrPerformanceMetricsStateMETA#next} field. */
        public XrPerformanceMetricsStateMETA.Buffer next(@NativeType("void const *") long value) { XrPerformanceMetricsStateMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrPerformanceMetricsStateMETA#enabled} field. */
        public XrPerformanceMetricsStateMETA.Buffer enabled(@NativeType("XrBool32") boolean value) { XrPerformanceMetricsStateMETA.nenabled(address(), value ? 1 : 0); return this; }

    }

}