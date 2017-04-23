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
package za.co.mmagon.jwebswing.plugins.jquerylayout.layout;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;

/**
 * Another name for the JQuery UI Layout
 * @author GedMarc
 * @since 22 Dec 2016
 * @version 1.0
 * 
 */
public class BorderLayout extends JQLayout
{

    private static final long serialVersionUID = 1L;
    /**
     * Sets a component as a border layout container
     * @param component 
     */
    public BorderLayout (ComponentHierarchyBase component)
    {
        super(component);
    }
}
