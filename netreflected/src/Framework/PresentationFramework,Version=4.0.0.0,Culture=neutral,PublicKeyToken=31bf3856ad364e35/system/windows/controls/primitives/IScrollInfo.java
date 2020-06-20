/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.windows.controls.primitives;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.windows.Rect;
import system.windows.media.Visual;
import system.windows.controls.ScrollViewer;


/**
 * The base .NET class managing System.Windows.Controls.Primitives.IScrollInfo, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Implements {@link IJCOBridgeReflected}.
 */
public interface IScrollInfo extends IJCOBridgeReflected {

    public static IScrollInfo ToIScrollInfo(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35");
        JCType classType = bridge.GetType("System.Windows.Controls.Primitives.IScrollInfo, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35" : "PresentationFramework"));
        NetType.AssertCast(classType, from);
        return new IScrollInfoImplementation(from.getJCOInstance());
    }

    /**
     * Returns the reflected Assembly name
     * 
     * @return A {@link String} representing the Fullname of reflected Assembly
     */
    public String getJCOAssemblyName();

    /**
     * Returns the reflected Class name
     * 
     * @return A {@link String} representing the Fullname of reflected Class
     */
    public String getJCOClassName();

    /**
     * Returns the reflected Class name used to build the object
     * 
     * @return A {@link String} representing the name used to allocated the object
     *         in CLR context
     */
    public String getJCOObjectName();

    /**
     * Returns the instantiated class
     * 
     * @return An {@link Object} representing the instance of the instantiated Class
     */
    public Object getJCOInstance();

    /**
     * Returns the instantiated class Type
     * 
     * @return A {@link JCType} representing the Type of the instantiated Class
     */
    public JCType getJCOType();

    // Methods section
    
    public void LineUp() throws Throwable;

    public void LineDown() throws Throwable;

    public void LineLeft() throws Throwable;

    public void LineRight() throws Throwable;

    public void PageUp() throws Throwable;

    public void PageDown() throws Throwable;

    public void PageLeft() throws Throwable;

    public void PageRight() throws Throwable;

    public void MouseWheelUp() throws Throwable;

    public void MouseWheelDown() throws Throwable;

    public void MouseWheelLeft() throws Throwable;

    public void MouseWheelRight() throws Throwable;

    public void SetHorizontalOffset(double offset) throws Throwable;

    public void SetVerticalOffset(double offset) throws Throwable;

    public Rect MakeVisible(Visual visual, Rect rectangle) throws Throwable;


    
    // Properties section
    
    public boolean getCanVerticallyScroll() throws Throwable;

    public void setCanVerticallyScroll(boolean CanVerticallyScroll) throws Throwable;

    public boolean getCanHorizontallyScroll() throws Throwable;

    public void setCanHorizontallyScroll(boolean CanHorizontallyScroll) throws Throwable;

    public double getExtentWidth() throws Throwable;

    public double getExtentHeight() throws Throwable;

    public double getViewportWidth() throws Throwable;

    public double getViewportHeight() throws Throwable;

    public double getHorizontalOffset() throws Throwable;

    public double getVerticalOffset() throws Throwable;

    public ScrollViewer getScrollOwner() throws Throwable;

    public void setScrollOwner(ScrollViewer ScrollOwner) throws Throwable;



    // Instance Events section
    

}