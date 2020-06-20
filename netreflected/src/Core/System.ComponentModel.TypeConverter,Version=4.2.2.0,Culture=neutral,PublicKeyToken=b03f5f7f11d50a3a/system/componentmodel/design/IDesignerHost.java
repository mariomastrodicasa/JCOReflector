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

package system.componentmodel.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.componentmodel.IComponent;
import system.componentmodel.IComponentImplementation;
import system.componentmodel.design.DesignerTransaction;
import system.componentmodel.design.IDesigner;
import system.componentmodel.design.IDesignerImplementation;
import system.componentmodel.design.ServiceCreatorCallback;
import system.componentmodel.IContainer;
import system.componentmodel.IContainerImplementation;
import system.EventHandler;
import system.componentmodel.design.DesignerTransactionCloseEventHandler;


/**
 * The base .NET class managing System.ComponentModel.Design.IDesignerHost, System.ComponentModel.TypeConverter, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Implements {@link IJCOBridgeReflected}.
 */
public interface IDesignerHost extends IJCOBridgeReflected {

    public static IDesignerHost ToIDesignerHost(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.ComponentModel.TypeConverter, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a");
        JCType classType = bridge.GetType("System.ComponentModel.Design.IDesignerHost, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "System.ComponentModel.TypeConverter, Version=4.2.2.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a" : "System.ComponentModel.TypeConverter"));
        NetType.AssertCast(classType, from);
        return new IDesignerHostImplementation(from.getJCOInstance());
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
    
    public void Activate() throws Throwable;

    public IComponent CreateComponent(NetType componentClass) throws Throwable;

    public IComponent CreateComponent(NetType componentClass, java.lang.String name) throws Throwable;

    public DesignerTransaction CreateTransaction() throws Throwable;

    public DesignerTransaction CreateTransaction(java.lang.String description) throws Throwable;

    public void DestroyComponent(IComponent component) throws Throwable;

    public IDesigner GetDesigner(IComponent component) throws Throwable;

    public NetType GetType(java.lang.String typeName) throws Throwable;

    public void AddService(NetType serviceType, NetObject serviceInstance, boolean promote) throws Throwable;

    public void AddService(NetType serviceType, NetObject serviceInstance) throws Throwable;

    public void AddService(NetType serviceType, ServiceCreatorCallback callback) throws Throwable;

    public void AddService(NetType serviceType, ServiceCreatorCallback callback, boolean promote) throws Throwable;

    public void RemoveService(NetType serviceType) throws Throwable;

    public void RemoveService(NetType serviceType, boolean promote) throws Throwable;

    public NetObject GetService(NetType serviceType) throws Throwable;


    
    // Properties section
    
    public boolean getLoading() throws Throwable;

    public boolean getInTransaction() throws Throwable;

    public IContainer getContainer() throws Throwable;

    public IComponent getRootComponent() throws Throwable;

    public java.lang.String getRootComponentClassName() throws Throwable;

    public java.lang.String getTransactionDescription() throws Throwable;



    // Instance Events section
    
    public void addActivated(EventHandler handler) throws Throwable;

    public void removeActivated(EventHandler handler) throws Throwable;

    public void addDeactivated(EventHandler handler) throws Throwable;

    public void removeDeactivated(EventHandler handler) throws Throwable;

    public void addLoadComplete(EventHandler handler) throws Throwable;

    public void removeLoadComplete(EventHandler handler) throws Throwable;

    public void addTransactionClosed(DesignerTransactionCloseEventHandler handler) throws Throwable;

    public void removeTransactionClosed(DesignerTransactionCloseEventHandler handler) throws Throwable;

    public void addTransactionClosing(DesignerTransactionCloseEventHandler handler) throws Throwable;

    public void removeTransactionClosing(DesignerTransactionCloseEventHandler handler) throws Throwable;

    public void addTransactionOpened(EventHandler handler) throws Throwable;

    public void removeTransactionOpened(EventHandler handler) throws Throwable;

    public void addTransactionOpening(EventHandler handler) throws Throwable;

    public void removeTransactionOpening(EventHandler handler) throws Throwable;


}