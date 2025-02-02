/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the subsets of the graphics pipeline being compiled.
 * 
 * <h5>Description</h5>
 * 
 * <p>If a {@link VkGraphicsPipelineLibraryCreateInfoEXT} structure is included in the {@code pNext} chain of {@link VkGraphicsPipelineCreateInfo}, it specifies the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets">subsets of the graphics pipeline</a> being created.</p>
 * 
 * <p>If this structure is omitted, and either {@link VkGraphicsPipelineCreateInfo}{@code ::flags} includes {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR} or the {@link VkGraphicsPipelineCreateInfo}{@code ::pNext} chain includes a {@link VkPipelineLibraryCreateInfoKHR} structure with a {@code libraryCount} greater than 0, it is as if {@code flags} is 0. Otherwise if this structure is omitted, it is as if {@code flags} includes all possible subsets of the graphics pipeline (i.e. a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-complete">complete graphics pipeline</a>).</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTGraphicsPipelineLibrary#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_LIBRARY_CREATE_INFO_EXT STRUCTURE_TYPE_GRAPHICS_PIPELINE_LIBRARY_CREATE_INFO_EXT}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkGraphicsPipelineLibraryFlagBitsEXT} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGraphicsPipelineLibraryCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkGraphicsPipelineLibraryFlagsEXT {@link #flags};
 * }</code></pre>
 */
public class VkGraphicsPipelineLibraryCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkGraphicsPipelineLibraryCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGraphicsPipelineLibraryCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkGraphicsPipelineLibraryFlagBitsEXT} specifying the subsets of the graphics pipeline that are being compiled. */
    @NativeType("VkGraphicsPipelineLibraryFlagsEXT")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkGraphicsPipelineLibraryCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTGraphicsPipelineLibrary#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_LIBRARY_CREATE_INFO_EXT STRUCTURE_TYPE_GRAPHICS_PIPELINE_LIBRARY_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkGraphicsPipelineLibraryCreateInfoEXT sType$Default() { return sType(EXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_LIBRARY_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkGraphicsPipelineLibraryCreateInfoEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkGraphicsPipelineLibraryCreateInfoEXT flags(@NativeType("VkGraphicsPipelineLibraryFlagsEXT") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGraphicsPipelineLibraryCreateInfoEXT set(
        int sType,
        long pNext,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGraphicsPipelineLibraryCreateInfoEXT set(VkGraphicsPipelineLibraryCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGraphicsPipelineLibraryCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGraphicsPipelineLibraryCreateInfoEXT malloc() {
        return wrap(VkGraphicsPipelineLibraryCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkGraphicsPipelineLibraryCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGraphicsPipelineLibraryCreateInfoEXT calloc() {
        return wrap(VkGraphicsPipelineLibraryCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkGraphicsPipelineLibraryCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkGraphicsPipelineLibraryCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkGraphicsPipelineLibraryCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkGraphicsPipelineLibraryCreateInfoEXT} instance for the specified memory address. */
    public static VkGraphicsPipelineLibraryCreateInfoEXT create(long address) {
        return wrap(VkGraphicsPipelineLibraryCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGraphicsPipelineLibraryCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkGraphicsPipelineLibraryCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineLibraryCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineLibraryCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineLibraryCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineLibraryCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineLibraryCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineLibraryCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkGraphicsPipelineLibraryCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineLibraryCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGraphicsPipelineLibraryCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkGraphicsPipelineLibraryCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsPipelineLibraryCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkGraphicsPipelineLibraryCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkGraphicsPipelineLibraryCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsPipelineLibraryCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkGraphicsPipelineLibraryCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkGraphicsPipelineLibraryCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineLibraryCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsPipelineLibraryCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsPipelineLibraryCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkGraphicsPipelineLibraryCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGraphicsPipelineLibraryCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkGraphicsPipelineLibraryCreateInfoEXT.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkGraphicsPipelineLibraryCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGraphicsPipelineLibraryCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkGraphicsPipelineLibraryCreateInfoEXT.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkGraphicsPipelineLibraryCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkGraphicsPipelineLibraryCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkGraphicsPipelineLibraryCreateInfoEXT ELEMENT_FACTORY = VkGraphicsPipelineLibraryCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkGraphicsPipelineLibraryCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGraphicsPipelineLibraryCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkGraphicsPipelineLibraryCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkGraphicsPipelineLibraryCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGraphicsPipelineLibraryCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkGraphicsPipelineLibraryCreateInfoEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkGraphicsPipelineLibraryCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkGraphicsPipelineLibraryCreateInfoEXT#flags} field. */
        @NativeType("VkGraphicsPipelineLibraryFlagsEXT")
        public int flags() { return VkGraphicsPipelineLibraryCreateInfoEXT.nflags(address()); }

        /** Sets the specified value to the {@link VkGraphicsPipelineLibraryCreateInfoEXT#sType} field. */
        public VkGraphicsPipelineLibraryCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkGraphicsPipelineLibraryCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTGraphicsPipelineLibrary#VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_LIBRARY_CREATE_INFO_EXT STRUCTURE_TYPE_GRAPHICS_PIPELINE_LIBRARY_CREATE_INFO_EXT} value to the {@link VkGraphicsPipelineLibraryCreateInfoEXT#sType} field. */
        public VkGraphicsPipelineLibraryCreateInfoEXT.Buffer sType$Default() { return sType(EXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_LIBRARY_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkGraphicsPipelineLibraryCreateInfoEXT#pNext} field. */
        public VkGraphicsPipelineLibraryCreateInfoEXT.Buffer pNext(@NativeType("void *") long value) { VkGraphicsPipelineLibraryCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkGraphicsPipelineLibraryCreateInfoEXT#flags} field. */
        public VkGraphicsPipelineLibraryCreateInfoEXT.Buffer flags(@NativeType("VkGraphicsPipelineLibraryFlagsEXT") int value) { VkGraphicsPipelineLibraryCreateInfoEXT.nflags(address(), value); return this; }

    }

}