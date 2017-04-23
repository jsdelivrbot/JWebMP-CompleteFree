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
package za.co.mmagon.jwebswing.plugins.bootstrap.carousel;

import java.util.Iterator;
import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.children.ListChildren;

/**
 * The indicators for the bootstrap carousel
 *
 * @author GedMarc
 * @since 01 Jan 2017
 * @version 1.0
 *
 */
public class BSCarouselIndicators extends List<ListChildren, NoAttributes, BSCarouselEvents, BSCarouselIndicators> implements BSCarouselChildren
{

    private static final long serialVersionUID = 1L;
    private BSCarousel carousel;

    /**
     * The indicators for the bootstrap carousel
     *
     * @param carousel
     */
    public BSCarouselIndicators(BSCarousel carousel)
    {
        super(true);
        this.carousel = carousel;
        addClass(BSComponentCarouselOptions.Carousel_Indicators);
    }

    /**
     *
     */
    @Override
    public void init()
    {
        if (!isInitialized())
        {
            if (this.carousel != null)
            {
                for (Iterator it = carousel.getSlides().iterator(); it.hasNext();)
                {
                    BSCarouselItem slide = (BSCarouselItem) it.next();
                    BSCarouselIndicatorItem newSlideIndicator = new BSCarouselIndicatorItem(this.carousel.getID(true),
                            carousel.getSlides().indexOf(slide), carousel.getSlides().indexOf(slide) == carousel.getActiveSlide());
                    add(newSlideIndicator);
                }
            }
        }
        super.init();
    }

}
