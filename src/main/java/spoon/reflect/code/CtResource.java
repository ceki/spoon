/*
 * SPDX-License-Identifier: (MIT OR CECILL-C)
 *
 * Copyright (C) 2006-2019 INRIA and contributors
 *
 * Spoon is available either under the terms of the MIT License (see LICENSE-MIT.txt) of the Cecill-C License (see LICENSE-CECILL-C.txt). You as the user are entitled to choose the terms under which to adopt Spoon.
 */
package spoon.reflect.code;

import spoon.reflect.declaration.CtTypedElement;

/**
 * This code element defines a resource used in the try-with-resource statement.
 * @param <T>
 *     The type of the resource.
 */
public interface CtResource<T> extends CtTypedElement<T>, CtCodeElement {
}
