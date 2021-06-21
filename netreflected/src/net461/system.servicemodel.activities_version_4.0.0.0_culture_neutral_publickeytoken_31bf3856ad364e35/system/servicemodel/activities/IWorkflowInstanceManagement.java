/*
 *  MIT License
 *
 *  Copyright (c) 2021 MASES s.r.l.
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

package system.servicemodel.activities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.IAsyncResult;
import system.IAsyncResultImplementation;
import system.Guid;
import system.AsyncCallback;


/**
 * The base .NET class managing System.ServiceModel.Activities.IWorkflowInstanceManagement, System.ServiceModel.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Activities.IWorkflowInstanceManagement" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.ServiceModel.Activities.IWorkflowInstanceManagement</a>
 */
public interface IWorkflowInstanceManagement extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: System.ServiceModel.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "System.ServiceModel.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: System.ServiceModel.Activities
     */
    public static final String assemblyShortName = "System.ServiceModel.Activities";
    /**
     * Qualified class name: System.ServiceModel.Activities.IWorkflowInstanceManagement
     */
    public static final String className = "System.ServiceModel.Activities.IWorkflowInstanceManagement";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IWorkflowInstanceManagement}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IWorkflowInstanceManagement} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IWorkflowInstanceManagement ToIWorkflowInstanceManagement(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("System.ServiceModel.Activities, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IWorkflowInstanceManagementImplementation(from.getJCOInstance());
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
    
    public IAsyncResult BeginAbandon(Guid instanceId, java.lang.String reason, AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginCancel(Guid instanceId, AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginRun(Guid instanceId, AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginSuspend(Guid instanceId, java.lang.String reason, AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginTerminate(Guid instanceId, java.lang.String reason, AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginTransactedCancel(Guid instanceId, AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginTransactedRun(Guid instanceId, AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginTransactedSuspend(Guid instanceId, java.lang.String reason, AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginTransactedTerminate(Guid instanceId, java.lang.String reason, AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginTransactedUnsuspend(Guid instanceId, AsyncCallback callback, NetObject state) throws Throwable;

    public IAsyncResult BeginUnsuspend(Guid instanceId, AsyncCallback callback, NetObject state) throws Throwable;

    public void Abandon(Guid instanceId, java.lang.String reason) throws Throwable;

    public void Cancel(Guid instanceId) throws Throwable;

    public void EndAbandon(IAsyncResult result) throws Throwable;

    public void EndCancel(IAsyncResult result) throws Throwable;

    public void EndRun(IAsyncResult result) throws Throwable;

    public void EndSuspend(IAsyncResult result) throws Throwable;

    public void EndTerminate(IAsyncResult result) throws Throwable;

    public void EndTransactedCancel(IAsyncResult result) throws Throwable;

    public void EndTransactedRun(IAsyncResult result) throws Throwable;

    public void EndTransactedSuspend(IAsyncResult result) throws Throwable;

    public void EndTransactedTerminate(IAsyncResult result) throws Throwable;

    public void EndTransactedUnsuspend(IAsyncResult result) throws Throwable;

    public void EndUnsuspend(IAsyncResult result) throws Throwable;

    public void Run(Guid instanceId) throws Throwable;

    public void Suspend(Guid instanceId, java.lang.String reason) throws Throwable;

    public void Terminate(Guid instanceId, java.lang.String reason) throws Throwable;

    public void TransactedCancel(Guid instanceId) throws Throwable;

    public void TransactedRun(Guid instanceId) throws Throwable;

    public void TransactedSuspend(Guid instanceId, java.lang.String reason) throws Throwable;

    public void TransactedTerminate(Guid instanceId, java.lang.String reason) throws Throwable;

    public void TransactedUnsuspend(Guid instanceId) throws Throwable;

    public void Unsuspend(Guid instanceId) throws Throwable;


    
    // Properties section
    


    // Instance Events section
    

}