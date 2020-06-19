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
 *      This code was generated from a template using JCOReflector version 1.1.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.windows;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.windows.RoutedEventArgs;
import system.windows.RoutedEvent;
import system.windows.input.MouseButtonEventHandler;
import system.windows.input.MouseEventHandler;
import system.windows.input.MouseWheelEventHandler;
import system.windows.input.StylusDownEventHandler;
import system.windows.input.StylusEventHandler;
import system.windows.input.StylusSystemGestureEventHandler;
import system.windows.input.StylusButtonEventHandler;
import system.windows.input.KeyEventHandler;
import system.windows.input.KeyboardFocusChangedEventHandler;
import system.windows.input.TextCompositionEventHandler;


/**
 * The base .NET class managing System.Windows.IFrameworkInputElement, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Implements {@link IJCOBridgeReflected}.
 */
public interface IFrameworkInputElement extends IJCOBridgeReflected {

    public static IFrameworkInputElement ToIFrameworkInputElement(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35");
        JCType classType = bridge.GetType("System.Windows.IFrameworkInputElement, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35" : "PresentationFramework"));
        NetType.AssertCast(classType, from);
        return new IFrameworkInputElementImplementation(from.getJCOInstance());
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
    
    public void RaiseEvent(RoutedEventArgs e) throws Throwable;

    public boolean CaptureMouse() throws Throwable;

    public void ReleaseMouseCapture() throws Throwable;

    public boolean CaptureStylus() throws Throwable;

    public void ReleaseStylusCapture() throws Throwable;

    public boolean Focus() throws Throwable;


    
    // Properties section
    
    public java.lang.String getName() throws Throwable;

    public void setName(java.lang.String Name) throws Throwable;

    public boolean getIsMouseOver() throws Throwable;

    public boolean getIsMouseDirectlyOver() throws Throwable;

    public boolean getIsMouseCaptured() throws Throwable;

    public boolean getIsStylusOver() throws Throwable;

    public boolean getIsStylusDirectlyOver() throws Throwable;

    public boolean getIsStylusCaptured() throws Throwable;

    public boolean getIsKeyboardFocusWithin() throws Throwable;

    public boolean getIsKeyboardFocused() throws Throwable;

    public boolean getIsEnabled() throws Throwable;

    public boolean getFocusable() throws Throwable;

    public void setFocusable(boolean Focusable) throws Throwable;



    // Instance Events section
    
    public void addPreviewMouseLeftButtonDown(MouseButtonEventHandler handler) throws Throwable;

    public void removePreviewMouseLeftButtonDown(MouseButtonEventHandler handler) throws Throwable;

    public void addMouseLeftButtonDown(MouseButtonEventHandler handler) throws Throwable;

    public void removeMouseLeftButtonDown(MouseButtonEventHandler handler) throws Throwable;

    public void addPreviewMouseLeftButtonUp(MouseButtonEventHandler handler) throws Throwable;

    public void removePreviewMouseLeftButtonUp(MouseButtonEventHandler handler) throws Throwable;

    public void addMouseLeftButtonUp(MouseButtonEventHandler handler) throws Throwable;

    public void removeMouseLeftButtonUp(MouseButtonEventHandler handler) throws Throwable;

    public void addPreviewMouseRightButtonDown(MouseButtonEventHandler handler) throws Throwable;

    public void removePreviewMouseRightButtonDown(MouseButtonEventHandler handler) throws Throwable;

    public void addMouseRightButtonDown(MouseButtonEventHandler handler) throws Throwable;

    public void removeMouseRightButtonDown(MouseButtonEventHandler handler) throws Throwable;

    public void addPreviewMouseRightButtonUp(MouseButtonEventHandler handler) throws Throwable;

    public void removePreviewMouseRightButtonUp(MouseButtonEventHandler handler) throws Throwable;

    public void addMouseRightButtonUp(MouseButtonEventHandler handler) throws Throwable;

    public void removeMouseRightButtonUp(MouseButtonEventHandler handler) throws Throwable;

    public void addPreviewMouseMove(MouseEventHandler handler) throws Throwable;

    public void removePreviewMouseMove(MouseEventHandler handler) throws Throwable;

    public void addMouseMove(MouseEventHandler handler) throws Throwable;

    public void removeMouseMove(MouseEventHandler handler) throws Throwable;

    public void addPreviewMouseWheel(MouseWheelEventHandler handler) throws Throwable;

    public void removePreviewMouseWheel(MouseWheelEventHandler handler) throws Throwable;

    public void addMouseWheel(MouseWheelEventHandler handler) throws Throwable;

    public void removeMouseWheel(MouseWheelEventHandler handler) throws Throwable;

    public void addMouseEnter(MouseEventHandler handler) throws Throwable;

    public void removeMouseEnter(MouseEventHandler handler) throws Throwable;

    public void addMouseLeave(MouseEventHandler handler) throws Throwable;

    public void removeMouseLeave(MouseEventHandler handler) throws Throwable;

    public void addGotMouseCapture(MouseEventHandler handler) throws Throwable;

    public void removeGotMouseCapture(MouseEventHandler handler) throws Throwable;

    public void addLostMouseCapture(MouseEventHandler handler) throws Throwable;

    public void removeLostMouseCapture(MouseEventHandler handler) throws Throwable;

    public void addPreviewStylusDown(StylusDownEventHandler handler) throws Throwable;

    public void removePreviewStylusDown(StylusDownEventHandler handler) throws Throwable;

    public void addStylusDown(StylusDownEventHandler handler) throws Throwable;

    public void removeStylusDown(StylusDownEventHandler handler) throws Throwable;

    public void addPreviewStylusUp(StylusEventHandler handler) throws Throwable;

    public void removePreviewStylusUp(StylusEventHandler handler) throws Throwable;

    public void addStylusUp(StylusEventHandler handler) throws Throwable;

    public void removeStylusUp(StylusEventHandler handler) throws Throwable;

    public void addPreviewStylusMove(StylusEventHandler handler) throws Throwable;

    public void removePreviewStylusMove(StylusEventHandler handler) throws Throwable;

    public void addStylusMove(StylusEventHandler handler) throws Throwable;

    public void removeStylusMove(StylusEventHandler handler) throws Throwable;

    public void addPreviewStylusInAirMove(StylusEventHandler handler) throws Throwable;

    public void removePreviewStylusInAirMove(StylusEventHandler handler) throws Throwable;

    public void addStylusInAirMove(StylusEventHandler handler) throws Throwable;

    public void removeStylusInAirMove(StylusEventHandler handler) throws Throwable;

    public void addStylusEnter(StylusEventHandler handler) throws Throwable;

    public void removeStylusEnter(StylusEventHandler handler) throws Throwable;

    public void addStylusLeave(StylusEventHandler handler) throws Throwable;

    public void removeStylusLeave(StylusEventHandler handler) throws Throwable;

    public void addPreviewStylusInRange(StylusEventHandler handler) throws Throwable;

    public void removePreviewStylusInRange(StylusEventHandler handler) throws Throwable;

    public void addStylusInRange(StylusEventHandler handler) throws Throwable;

    public void removeStylusInRange(StylusEventHandler handler) throws Throwable;

    public void addPreviewStylusOutOfRange(StylusEventHandler handler) throws Throwable;

    public void removePreviewStylusOutOfRange(StylusEventHandler handler) throws Throwable;

    public void addStylusOutOfRange(StylusEventHandler handler) throws Throwable;

    public void removeStylusOutOfRange(StylusEventHandler handler) throws Throwable;

    public void addPreviewStylusSystemGesture(StylusSystemGestureEventHandler handler) throws Throwable;

    public void removePreviewStylusSystemGesture(StylusSystemGestureEventHandler handler) throws Throwable;

    public void addStylusSystemGesture(StylusSystemGestureEventHandler handler) throws Throwable;

    public void removeStylusSystemGesture(StylusSystemGestureEventHandler handler) throws Throwable;

    public void addStylusButtonDown(StylusButtonEventHandler handler) throws Throwable;

    public void removeStylusButtonDown(StylusButtonEventHandler handler) throws Throwable;

    public void addPreviewStylusButtonDown(StylusButtonEventHandler handler) throws Throwable;

    public void removePreviewStylusButtonDown(StylusButtonEventHandler handler) throws Throwable;

    public void addPreviewStylusButtonUp(StylusButtonEventHandler handler) throws Throwable;

    public void removePreviewStylusButtonUp(StylusButtonEventHandler handler) throws Throwable;

    public void addStylusButtonUp(StylusButtonEventHandler handler) throws Throwable;

    public void removeStylusButtonUp(StylusButtonEventHandler handler) throws Throwable;

    public void addGotStylusCapture(StylusEventHandler handler) throws Throwable;

    public void removeGotStylusCapture(StylusEventHandler handler) throws Throwable;

    public void addLostStylusCapture(StylusEventHandler handler) throws Throwable;

    public void removeLostStylusCapture(StylusEventHandler handler) throws Throwable;

    public void addPreviewKeyDown(KeyEventHandler handler) throws Throwable;

    public void removePreviewKeyDown(KeyEventHandler handler) throws Throwable;

    public void addKeyDown(KeyEventHandler handler) throws Throwable;

    public void removeKeyDown(KeyEventHandler handler) throws Throwable;

    public void addPreviewKeyUp(KeyEventHandler handler) throws Throwable;

    public void removePreviewKeyUp(KeyEventHandler handler) throws Throwable;

    public void addKeyUp(KeyEventHandler handler) throws Throwable;

    public void removeKeyUp(KeyEventHandler handler) throws Throwable;

    public void addPreviewGotKeyboardFocus(KeyboardFocusChangedEventHandler handler) throws Throwable;

    public void removePreviewGotKeyboardFocus(KeyboardFocusChangedEventHandler handler) throws Throwable;

    public void addGotKeyboardFocus(KeyboardFocusChangedEventHandler handler) throws Throwable;

    public void removeGotKeyboardFocus(KeyboardFocusChangedEventHandler handler) throws Throwable;

    public void addPreviewLostKeyboardFocus(KeyboardFocusChangedEventHandler handler) throws Throwable;

    public void removePreviewLostKeyboardFocus(KeyboardFocusChangedEventHandler handler) throws Throwable;

    public void addLostKeyboardFocus(KeyboardFocusChangedEventHandler handler) throws Throwable;

    public void removeLostKeyboardFocus(KeyboardFocusChangedEventHandler handler) throws Throwable;

    public void addPreviewTextInput(TextCompositionEventHandler handler) throws Throwable;

    public void removePreviewTextInput(TextCompositionEventHandler handler) throws Throwable;

    public void addTextInput(TextCompositionEventHandler handler) throws Throwable;

    public void removeTextInput(TextCompositionEventHandler handler) throws Throwable;


}