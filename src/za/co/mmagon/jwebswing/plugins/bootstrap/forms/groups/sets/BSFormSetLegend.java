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
package za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.sets;

import za.co.mmagon.jwebswing.base.html.Italic;

/**
 * A legend to describe a form set
 *
 * @author GedMarc
 * @since 18 Jan 2017
 *
 */
public class BSFormSetLegend extends Italic implements BSFormSetChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * A legend to describe a form set
     */
    public BSFormSetLegend()
    {
        setTag("legend");
    }

    /**
     * A legend to describe a form set
     *
     * @param text
     */
    public BSFormSetLegend(String text)
    {
        super(text);
        setTag("legend");
    }

}
