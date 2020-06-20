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

package system.servicemodel;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.AsyncCallback;
import system.TimeSpan;
import system.servicemodel.CommunicationState;
import system.EventHandler;


/**
 * The base .NET class managing System.ServiceModel.ICommunicationObject, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Implements {@link IJCOBridgeReflected}.
 */
public interface ICommunicationObject extends IJCOBridgeReflected {

    public static ICommunicationObject ToICommunicationObject(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089");
        JCType classType = bridge.GetType("System.ServiceModel.ICommunicationObject, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089" : "System.ServiceModel"));
        NetType.AssertCast(classType, from);
        return new ICommunicationObjectImplementation(from.getJCOInstance());
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
    
    public void Abort() throws Throwable;

    public IAsyncResult BeginClose(AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginClose(TimeSpan timeout, AsyncCallback callback, NetObject state) throws Throwable;

    public void EndClose(IAsyncResult result) throws Throwable;

    public void Open() throws Throwable;

    public void Open(TimeSpan timeout) throws Throwable;

    public IAsyncResult BeginOpen(AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginOpen(TimeSpan timeout, AsyncCallback callback, NetObject state) throws Throwable;

    public void EndOpen(IAsyncResult result) throws Throwable;

    public void Close() throws Throwable;

    public void Close(TimeSpan timeout) throws Throwable;


    
    // Properties section
    
    public CommunicationState getState() throws Throwable;



    // Instance Events section
    
    public void addClosed(EventHandler handler) throws Throwable;

    public void removeClosed(EventHandler handler) throws Throwable;

    public void addClosing(EventHandler handler) throws Throwable;

    public void removeClosing(EventHandler handler) throws Throwable;

    public void addFaulted(EventHandler handler) throws Throwable;

    public void removeFaulted(EventHandler handler) throws Throwable;

    public void addOpened(EventHandler handler) throws Throwable;

    public void removeOpened(EventHandler handler) throws Throwable;

    public void addOpening(EventHandler handler) throws Throwable;

    public void removeOpening(EventHandler handler) throws Throwable;


}