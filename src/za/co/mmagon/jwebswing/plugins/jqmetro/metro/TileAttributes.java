/* 
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.jqmetro.metro;

import za.co.mmagon.jwebswing.base.html.interfaces.AttributeDefinitions;

/**
 * Available attributes for the JWMetro Tile
 *
 * @author MMagon
 * @since 23 Sep 2013
 * @version 1.0
 */
public enum TileAttributes implements AttributeDefinitions
{
    data_direction,
    data_mode,
    data_link;

    @Override
    public String toString()
    {
        return super.toString().replace('_', '-');
    }

    @Override
    public boolean isKeyword()
    {
        return false;
    }

}
