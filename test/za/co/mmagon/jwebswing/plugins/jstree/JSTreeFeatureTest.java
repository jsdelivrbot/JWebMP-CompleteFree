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
package za.co.mmagon.jwebswing.plugins.jstree;

import za.co.mmagon.jwebswing.plugins.jstree.JSTree;
import org.junit.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.Page;

/**
 *
 * @author GedMarc
 */
public class JSTreeFeatureTest extends BaseTestClass
{

    public JSTreeFeatureTest()
    {
    }

    @Test
    public void testGetOptions()
    {
        Page p = getInstance();
        JSTree tree = new JSTree();
        p.getBody().add(tree);
    }

    @Test
    public void testAssignments()
    {
    }

}
