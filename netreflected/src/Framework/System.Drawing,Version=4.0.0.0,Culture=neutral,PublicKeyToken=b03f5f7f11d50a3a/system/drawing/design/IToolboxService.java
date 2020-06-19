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

package system.drawing.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.drawing.design.ToolboxItemCreatorCallback;
import system.componentmodel.design.IDesignerHost;
import system.componentmodel.design.IDesignerHostImplementation;
import system.drawing.design.ToolboxItem;
import system.drawing.design.ToolboxItemCollection;
import system.collections.ICollection;
import system.collections.ICollectionImplementation;
import system.drawing.design.CategoryNameCollection;


/**
 * The base .NET class managing System.Drawing.Design.IToolboxService, System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Implements {@link IJCOBridgeReflected}.
 */
public interface IToolboxService extends IJCOBridgeReflected {

    public static IToolboxService ToIToolboxService(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a");
        JCType classType = bridge.GetType("System.Drawing.Design.IToolboxService, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "System.Drawing, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a" : "System.Drawing"));
        NetType.AssertCast(classType, from);
        return new IToolboxServiceImplementation(from.getJCOInstance());
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
    
    public void AddCreator(ToolboxItemCreatorCallback creator, java.lang.String format) throws Throwable;

    public void AddCreator(ToolboxItemCreatorCallback creator, java.lang.String format, IDesignerHost host) throws Throwable;

    public void AddLinkedToolboxItem(ToolboxItem toolboxItem, IDesignerHost host) throws Throwable;

    public void AddLinkedToolboxItem(ToolboxItem toolboxItem, java.lang.String category, IDesignerHost host) throws Throwable;

    public void AddToolboxItem(ToolboxItem toolboxItem) throws Throwable;

    public void AddToolboxItem(ToolboxItem toolboxItem, java.lang.String category) throws Throwable;

    public ToolboxItem DeserializeToolboxItem(NetObject serializedObject) throws Throwable;

    public ToolboxItem DeserializeToolboxItem(NetObject serializedObject, IDesignerHost host) throws Throwable;

    public ToolboxItem GetSelectedToolboxItem() throws Throwable;

    public ToolboxItem GetSelectedToolboxItem(IDesignerHost host) throws Throwable;

    public ToolboxItemCollection GetToolboxItems() throws Throwable;

    public ToolboxItemCollection GetToolboxItems(IDesignerHost host) throws Throwable;

    public ToolboxItemCollection GetToolboxItems(java.lang.String category) throws Throwable;

    public ToolboxItemCollection GetToolboxItems(java.lang.String category, IDesignerHost host) throws Throwable;

    public boolean IsSupported(NetObject serializedObject, IDesignerHost host) throws Throwable;

    public boolean IsSupported(NetObject serializedObject, ICollection filterAttributes) throws Throwable;

    public boolean IsToolboxItem(NetObject serializedObject) throws Throwable;

    public boolean IsToolboxItem(NetObject serializedObject, IDesignerHost host) throws Throwable;

    public void Refresh() throws Throwable;

    public void RemoveCreator(java.lang.String format) throws Throwable;

    public void RemoveCreator(java.lang.String format, IDesignerHost host) throws Throwable;

    public void RemoveToolboxItem(ToolboxItem toolboxItem) throws Throwable;

    public void RemoveToolboxItem(ToolboxItem toolboxItem, java.lang.String category) throws Throwable;

    public void SelectedToolboxItemUsed() throws Throwable;

    public NetObject SerializeToolboxItem(ToolboxItem toolboxItem) throws Throwable;

    public boolean SetCursor() throws Throwable;

    public void SetSelectedToolboxItem(ToolboxItem toolboxItem) throws Throwable;


    
    // Properties section
    
    public CategoryNameCollection getCategoryNames() throws Throwable;

    public java.lang.String getSelectedCategory() throws Throwable;

    public void setSelectedCategory(java.lang.String SelectedCategory) throws Throwable;



    // Instance Events section
    

}