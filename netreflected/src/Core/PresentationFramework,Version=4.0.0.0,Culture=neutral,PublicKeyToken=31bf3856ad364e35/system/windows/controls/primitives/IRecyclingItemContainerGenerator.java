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
import system.windows.controls.primitives.GeneratorPosition;
import system.IDisposable;
import system.IDisposableImplementation;
import system.windows.controls.primitives.GeneratorDirection;
import system.windows.controls.ItemContainerGenerator;
import system.windows.controls.Panel;
import system.windows.DependencyObject;


/**
 * The base .NET class managing System.Windows.Controls.Primitives.IRecyclingItemContainerGenerator, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Implements {@link IJCOBridgeReflected}.
 */
public interface IRecyclingItemContainerGenerator extends IJCOBridgeReflected {

    public static IRecyclingItemContainerGenerator ToIRecyclingItemContainerGenerator(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35");
        JCType classType = bridge.GetType("System.Windows.Controls.Primitives.IRecyclingItemContainerGenerator, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35" : "PresentationFramework"));
        NetType.AssertCast(classType, from);
        return new IRecyclingItemContainerGeneratorImplementation(from.getJCOInstance());
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
    
    public int IndexFromGeneratorPosition(GeneratorPosition position) throws Throwable;

    public IDisposable StartAt(GeneratorPosition position, GeneratorDirection direction) throws Throwable;

    public IDisposable StartAt(GeneratorPosition position, GeneratorDirection direction, boolean allowStartAtRealizedItem) throws Throwable;

    public ItemContainerGenerator GetItemContainerGeneratorForPanel(Panel panel) throws Throwable;

    public GeneratorPosition GeneratorPositionFromIndex(int itemIndex) throws Throwable;

    public DependencyObject GenerateNext() throws Throwable;

    public void PrepareItemContainer(DependencyObject container) throws Throwable;

    public void Recycle(GeneratorPosition position, int count) throws Throwable;

    public void Remove(GeneratorPosition position, int count) throws Throwable;

    public void RemoveAll() throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}