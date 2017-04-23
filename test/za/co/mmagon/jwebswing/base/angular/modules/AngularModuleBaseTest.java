/*
 * Copyright (C) 2016 GedMarc
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
package za.co.mmagon.jwebswing.base.angular.modules;

import org.junit.Assert;
import org.junit.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.base.html.Body;
import za.co.mmagon.jwebswing.plugins.moment.Moment;

/**
 *
 * @author GedMarc
 */
public class AngularModuleBaseTest extends BaseTestClass
{

    public AngularModuleBaseTest()
    {
    }

    @Test
    public void testModuleBase()
    {
        Page p = getPage();
        Body b = p.getBody();
        b.add(new Moment());
        AngularModuleBase comp = new JWAngularModule(p);
        System.out.println(comp.toString());
        Assert.assertEquals("var jwApp = angular.module('jwApp',['angularMoment']);", comp.toString());

        System.out.println(p.toString(true));

    }
}
