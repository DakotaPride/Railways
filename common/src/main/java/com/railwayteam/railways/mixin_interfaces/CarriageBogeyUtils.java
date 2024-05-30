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

package com.railwayteam.railways.mixin_interfaces;

import com.railwayteam.railways.mixin.AccessorCarriageBogey;
import com.simibubi.create.content.trains.bogey.AbstractBogeyBlock;
import com.simibubi.create.content.trains.entity.CarriageBogey;

import java.util.function.Supplier;

public interface CarriageBogeyUtils {
    static AbstractBogeyBlock<?> getType(CarriageBogey bogey) {
        Supplier<Supplier<AbstractBogeyBlock<?>>> supplier = () -> () -> ((AccessorCarriageBogey) bogey).getType(); // classload protection
        return supplier.get().get();
    }
}
