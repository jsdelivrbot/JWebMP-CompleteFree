/*
 * Copyright (C) 2016 ged_m
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
package za.co.mmagon.jwebswing.components.jqueryLayout.layout;

import za.co.mmagon.jwebswing.plugins.jquerylayout.layout.JQLayout;
import org.junit.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.Page;

/**
 *
 * @author ged_m
 */
public class JQLayoutTest extends BaseTestClass
{

    public JQLayoutTest()
    {
    }

    @Test
    public void testJQLayout()
    {
        Page p = getPage();
        JQLayout layout = new JQLayout(p.getBody());

        System.out.println(p.toString(true));
        System.out.println(p);
    }

}
