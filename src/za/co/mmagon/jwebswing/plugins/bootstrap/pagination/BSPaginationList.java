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
package za.co.mmagon.jwebswing.plugins.bootstrap.pagination;

import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;

/**
 * The default paging list
 *
 * @author GedMarc
 * @since 21 Jan 2017
 *
 */
public class BSPaginationList extends List<BSPageinationListItem, NoAttributes, GlobalEvents, BSPaginationList> implements BSPaginationChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * The default paging list
     */
    public BSPaginationList()
    {
        addClass(BSComponentPaginationOptions.Pagination);
    }
}
