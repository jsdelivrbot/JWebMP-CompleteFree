/*
 * Copyright (C) 2017 GedMarc
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

import za.co.mmagon.jwebswing.plugins.bootstrap.pagination.BSComponentPaginationAlignmentOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.pagination.BSPaginationLink;
import za.co.mmagon.jwebswing.plugins.bootstrap.pagination.BSComponentPaginationSizingOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.pagination.BSPagination;
import org.junit.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.base.html.Span;

/**
 *
 * @author GedMarc
 */
public class BSPaginationTest extends BaseTestClass
{

    public BSPaginationTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        BSPagination page = new BSPagination();
        BSPaginationLink link = page.createPageLink("AriaLabel");

        link.add(new Span("&laquo;"));

        link.getListItem().setDisabled();

        System.out.println(page.toString(true));
    }

    @Test
    public void testSizes()
    {
        BSPagination page = new BSPagination(BSComponentPaginationSizingOptions.Pagination_Sm);
        BSPaginationLink link = page.createPageLink("AriaLabel");

        link.add(new Span("&laquo;"));

        link.getListItem().setDisabled();

        System.out.println(page.toString(true));
    }

    @Test
    public void testAlignment()
    {
        BSPagination page = new BSPagination(BSComponentPaginationSizingOptions.Pagination_Lg, BSComponentPaginationAlignmentOptions.Justify_Content_Center);
        BSPaginationLink link = page.createPageLink("AriaLabel");

        link.add(new Span("&laquo;"));

        link.getListItem().setDisabled();

        System.out.println(page.toString(true));
    }
}
