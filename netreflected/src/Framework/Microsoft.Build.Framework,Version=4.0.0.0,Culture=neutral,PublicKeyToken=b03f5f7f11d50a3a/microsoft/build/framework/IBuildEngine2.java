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

package microsoft.build.framework;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;
import microsoft.build.framework.BuildErrorEventArgs;
import microsoft.build.framework.BuildWarningEventArgs;
import microsoft.build.framework.BuildMessageEventArgs;
import microsoft.build.framework.CustomBuildEventArgs;


/**
 * The base .NET class managing Microsoft.Build.Framework.IBuildEngine2, Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Implements {@link IJCOBridgeReflected}.
 */
public interface IBuildEngine2 extends IJCOBridgeReflected {

    public static IBuildEngine2 ToIBuildEngine2(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a");
        JCType classType = bridge.GetType("Microsoft.Build.Framework.IBuildEngine2, " + (JCOBridgeInstance.getUseFullAssemblyName() ? "Microsoft.Build.Framework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a" : "Microsoft.Build.Framework"));
        NetType.AssertCast(classType, from);
        return new IBuildEngine2Implementation(from.getJCOInstance());
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
    
    public boolean BuildProjectFile(java.lang.String projectFileName, java.lang.String[] targetNames, IDictionary globalProperties, IDictionary targetOutputs, java.lang.String toolsVersion) throws Throwable;

    public boolean BuildProjectFilesInParallel(java.lang.String[] projectFileNames, java.lang.String[] targetNames, IDictionary[] globalProperties, IDictionary[] targetOutputsPerProject, java.lang.String[] toolsVersion, boolean useResultsCache, boolean unloadProjectsOnCompletion) throws Throwable;

    public void LogErrorEvent(BuildErrorEventArgs e) throws Throwable;

    public void LogWarningEvent(BuildWarningEventArgs e) throws Throwable;

    public void LogMessageEvent(BuildMessageEventArgs e) throws Throwable;

    public void LogCustomEvent(CustomBuildEventArgs e) throws Throwable;

    public boolean BuildProjectFile(java.lang.String projectFileName, java.lang.String[] targetNames, IDictionary globalProperties, IDictionary targetOutputs) throws Throwable;


    
    // Properties section
    
    public boolean getIsRunningMultipleNodes() throws Throwable;

    public boolean getContinueOnError() throws Throwable;

    public int getLineNumberOfTaskNode() throws Throwable;

    public int getColumnNumberOfTaskNode() throws Throwable;

    public java.lang.String getProjectFileOfTaskNode() throws Throwable;



    // Instance Events section
    

}