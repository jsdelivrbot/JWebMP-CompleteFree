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
package za.co.mmagon.jwebswing.plugins.jqmetro.metro.tiles;

import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 *
 * @author GedMarc
 * @since Aug 30, 2016
 * @version 1.0
 *
 */
@ComponentInformation(name = "Flip List Tile",
        description = "flip-list tile mode to flip any number of tiles in sequence or at custom intervals to create mosaics and other unique content presentations (e.g. People tile or the color strip, skills tile, and the hover list on the home page)",
        url = "http://www.drewgreenwell.com/projects/metrojs")
public class FlipListTile extends Tile<FlipListTileAttributes>
{

    private static final long serialVersionUID = 1L;

    public FlipListTile()
    {

    }
}
