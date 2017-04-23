/*
 * Copyright (C) 2015 GedMarc
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
package za.co.mmagon.jwebswing.base.html;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author GedMarc
 */
public class ParagraphTest
{

    public ParagraphTest()
    {
    }

    /**
     * Test of getText method, of class Paragraph.
     */
    @Test
    public void testGetText()
    {
        System.out.println("getText");
        Paragraph instance = new Paragraph();
        instance.setID("Paragraph");
        System.out.println(instance.toString(true));
        String expResult = "<p id=\"Paragraph\"></p>";
        StringBuilder result = new StringBuilder(instance.toString(true));
        assertEquals(expResult, result.toString());
    }

}
