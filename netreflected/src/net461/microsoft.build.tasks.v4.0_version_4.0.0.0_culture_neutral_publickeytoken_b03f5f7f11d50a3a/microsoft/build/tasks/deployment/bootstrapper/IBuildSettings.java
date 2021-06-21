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

package microsoft.build.tasks.deployment.bootstrapper;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.build.tasks.deployment.bootstrapper.ComponentsLocation;
import microsoft.build.tasks.deployment.bootstrapper.ProductBuilderCollection;


/**
 * The base .NET class managing Microsoft.Build.Tasks.Deployment.Bootstrapper.IBuildSettings, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Deployment.Bootstrapper.IBuildSettings" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Deployment.Bootstrapper.IBuildSettings</a>
 */
public interface IBuildSettings extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.Build.Tasks.v4.0
     */
    public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    /**
     * Qualified class name: Microsoft.Build.Tasks.Deployment.Bootstrapper.IBuildSettings
     */
    public static final String className = "Microsoft.Build.Tasks.Deployment.Bootstrapper.IBuildSettings";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IBuildSettings}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IBuildSettings} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IBuildSettings ToIBuildSettings(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IBuildSettingsImplementation(from.getJCOInstance());
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
    
    public boolean getApplicationRequiresElevation() throws Throwable;

    public void setApplicationRequiresElevation(boolean ApplicationRequiresElevation) throws Throwable;

    public boolean getCopyComponents() throws Throwable;

    public void setCopyComponents(boolean CopyComponents) throws Throwable;

    public boolean getValidate() throws Throwable;

    public void setValidate(boolean Validate) throws Throwable;

    public int getFallbackLCID() throws Throwable;

    public void setFallbackLCID(int FallbackLCID) throws Throwable;

    public int getLCID() throws Throwable;

    public void setLCID(int LCID) throws Throwable;

    public ComponentsLocation getComponentsLocation() throws Throwable;

    public void setComponentsLocation(ComponentsLocation ComponentsLocation) throws Throwable;

    public ProductBuilderCollection getProductBuilders() throws Throwable;

    public java.lang.String getApplicationFile() throws Throwable;

    public void setApplicationFile(java.lang.String ApplicationFile) throws Throwable;

    public java.lang.String getApplicationName() throws Throwable;

    public void setApplicationName(java.lang.String ApplicationName) throws Throwable;

    public java.lang.String getApplicationUrl() throws Throwable;

    public void setApplicationUrl(java.lang.String ApplicationUrl) throws Throwable;

    public java.lang.String getComponentsUrl() throws Throwable;

    public void setComponentsUrl(java.lang.String ComponentsUrl) throws Throwable;

    public java.lang.String getOutputPath() throws Throwable;

    public void setOutputPath(java.lang.String OutputPath) throws Throwable;

    public java.lang.String getSupportUrl() throws Throwable;

    public void setSupportUrl(java.lang.String SupportUrl) throws Throwable;



    // Instance Events section
    

}