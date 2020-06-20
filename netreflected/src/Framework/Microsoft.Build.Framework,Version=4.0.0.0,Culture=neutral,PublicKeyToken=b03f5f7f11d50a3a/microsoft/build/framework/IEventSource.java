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

package microsoft.build.framework;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.build.framework.BuildMessageEventHandler;
import microsoft.build.framework.BuildErrorEventHandler;
import microsoft.build.framework.BuildWarningEventHandler;
import microsoft.build.framework.BuildStartedEventHandler;
import microsoft.build.framework.BuildFinishedEventHandler;
import microsoft.build.framework.ProjectStartedEventHandler;
import microsoft.build.framework.ProjectFinishedEventHandler;
import microsoft.build.framework.TargetStartedEventHandler;
import microsoft.build.framework.TargetFinishedEventHandler;
import microsoft.build.framework.TaskStartedEventHandler;
import microsoft.build.framework.TaskFinishedEventHandler;
import microsoft.build.framework.CustomBuildEventHandler;
import microsoft.build.framework.BuildStatusEventHandler;
import microsoft.build.framework.AnyEventHandler;


/**
 * The base .NET class managing Microsoft.Build.Framework.IEventSource, Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Implements {@link IJCOBridgeReflected}.
 */
public interface IEventSource extends IJCOBridgeReflected {

    public static IEventSource ToIEventSource(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a");
        JCType classType = bridge.GetType("Microsoft.Build.Framework.IEventSource, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a" : "Microsoft.Build.Framework"));
        NetType.AssertCast(classType, from);
        return new IEventSourceImplementation(from.getJCOInstance());
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
    

    
    // Properties section
    


    // Instance Events section
    
    public void addMessageRaised(BuildMessageEventHandler handler) throws Throwable;

    public void removeMessageRaised(BuildMessageEventHandler handler) throws Throwable;

    public void addErrorRaised(BuildErrorEventHandler handler) throws Throwable;

    public void removeErrorRaised(BuildErrorEventHandler handler) throws Throwable;

    public void addWarningRaised(BuildWarningEventHandler handler) throws Throwable;

    public void removeWarningRaised(BuildWarningEventHandler handler) throws Throwable;

    public void addBuildStarted(BuildStartedEventHandler handler) throws Throwable;

    public void removeBuildStarted(BuildStartedEventHandler handler) throws Throwable;

    public void addBuildFinished(BuildFinishedEventHandler handler) throws Throwable;

    public void removeBuildFinished(BuildFinishedEventHandler handler) throws Throwable;

    public void addProjectStarted(ProjectStartedEventHandler handler) throws Throwable;

    public void removeProjectStarted(ProjectStartedEventHandler handler) throws Throwable;

    public void addProjectFinished(ProjectFinishedEventHandler handler) throws Throwable;

    public void removeProjectFinished(ProjectFinishedEventHandler handler) throws Throwable;

    public void addTargetStarted(TargetStartedEventHandler handler) throws Throwable;

    public void removeTargetStarted(TargetStartedEventHandler handler) throws Throwable;

    public void addTargetFinished(TargetFinishedEventHandler handler) throws Throwable;

    public void removeTargetFinished(TargetFinishedEventHandler handler) throws Throwable;

    public void addTaskStarted(TaskStartedEventHandler handler) throws Throwable;

    public void removeTaskStarted(TaskStartedEventHandler handler) throws Throwable;

    public void addTaskFinished(TaskFinishedEventHandler handler) throws Throwable;

    public void removeTaskFinished(TaskFinishedEventHandler handler) throws Throwable;

    public void addCustomEventRaised(CustomBuildEventHandler handler) throws Throwable;

    public void removeCustomEventRaised(CustomBuildEventHandler handler) throws Throwable;

    public void addStatusEventRaised(BuildStatusEventHandler handler) throws Throwable;

    public void removeStatusEventRaised(BuildStatusEventHandler handler) throws Throwable;

    public void addAnyEventRaised(AnyEventHandler handler) throws Throwable;

    public void removeAnyEventRaised(AnyEventHandler handler) throws Throwable;


}