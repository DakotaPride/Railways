/*
 * Steam 'n' Rails
 * Copyright (c) 2022-2024 The Railways Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package com.railwayteam.railways.util;

// See https://stackoverflow.com/questions/31316581/a-peculiar-feature-of-exception-type-inference-in-java-8
public class ExceptionUtils {
    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwExceptionInternal(Throwable exception) throws T // T is inferred to be RuntimeException, so this works!
    {
        // this cast doesn't actually happen at runtime
        throw (T) exception;
    }

    public static void throwExceptionUnchecked(Throwable exception)
    {
        ExceptionUtils.throwExceptionInternal(exception);
    }
}
