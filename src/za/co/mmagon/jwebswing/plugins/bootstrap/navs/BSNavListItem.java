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
package za.co.mmagon.jwebswing.plugins.bootstrap.navs;

import za.co.mmagon.jwebswing.base.html.ListItem;

/**
 *
 * @author GedMarc
 * @since 23 Jan 2017
 *
 */
public class BSNavListItem extends ListItem implements BSNavsChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a list item with a link item inside
     *
     * @param linkItem
     */
    public BSNavListItem(BSNavLinkItem linkItem)
    {
        add(linkItem);
        addClass(BSComponentNavsOptions.Nav_Item);
    }
}
