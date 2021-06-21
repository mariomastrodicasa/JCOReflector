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

package microsoft.jscript.vsa;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;

// Import section
import microsoft.jscript.vsa.IJSVsaPersistSite;
import microsoft.jscript.vsa.IJSVsaPersistSiteImplementation;
import microsoft.jscript.vsa.IJSVsaItems;
import microsoft.jscript.vsa.IJSVsaItemsImplementation;
import microsoft.jscript.vsa.IJSVsaSite;
import microsoft.jscript.vsa.IJSVsaSiteImplementation;
import system.reflection.Assembly;
import system.security.policy.Evidence;


/**
 * The base .NET class managing Microsoft.JScript.Vsa.IJSVsaEngine, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.Vsa.IJSVsaEngine" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.Vsa.IJSVsaEngine</a>
 */
public interface IJSVsaEngine extends IJCOBridgeReflected {
    /**
     * Fully assembly qualified name: Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.JScript
     */
    public static final String assemblyShortName = "Microsoft.JScript";
    /**
     * Qualified class name: Microsoft.JScript.Vsa.IJSVsaEngine
     */
    public static final String className = "Microsoft.JScript.Vsa.IJSVsaEngine";
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IJSVsaEngine}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IJSVsaEngine} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IJSVsaEngine ToIJSVsaEngine(IJCOBridgeReflected from) throws Throwable {
        JCOBridge bridge = JCOBridgeInstance.getInstance("Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a");
        JCType classType = bridge.GetType(className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        NetType.AssertCast(classType, from);
        return new IJSVsaEngineImplementation(from.getJCOInstance());
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
    
    public boolean Compile() throws Throwable;

    public boolean IsValidIdentifier(java.lang.String identifier) throws Throwable;

    public NetObject GetOption(java.lang.String name) throws Throwable;

    public void Close() throws Throwable;

    public void InitNew() throws Throwable;

    public void LoadSourceState(IJSVsaPersistSite site) throws Throwable;

    public void Reset() throws Throwable;

    public void RevokeCache() throws Throwable;

    public void Run() throws Throwable;

    public void SaveSourceState(IJSVsaPersistSite site) throws Throwable;

    public void SetOption(java.lang.String name, NetObject value) throws Throwable;


    
    // Properties section
    
    public boolean getGenerateDebugInfo() throws Throwable;

    public void setGenerateDebugInfo(boolean GenerateDebugInfo) throws Throwable;

    public boolean getIsCompiled() throws Throwable;

    public boolean getIsDirty() throws Throwable;

    public boolean getIsRunning() throws Throwable;

    public int getLCID() throws Throwable;

    public void setLCID(int LCID) throws Throwable;

    public IJSVsaItems getItems() throws Throwable;

    public IJSVsaSite getSite() throws Throwable;

    public void setSite(IJSVsaSite Site) throws Throwable;

    public Assembly getAssembly() throws Throwable;

    public Evidence getEvidence() throws Throwable;

    public void setEvidence(Evidence Evidence) throws Throwable;

    public java.lang.String getLanguage() throws Throwable;

    public java.lang.String getName() throws Throwable;

    public void setName(java.lang.String Name) throws Throwable;

    public java.lang.String getRootMoniker() throws Throwable;

    public void setRootMoniker(java.lang.String RootMoniker) throws Throwable;

    public java.lang.String getRootNamespace() throws Throwable;

    public void setRootNamespace(java.lang.String RootNamespace) throws Throwable;

    public java.lang.String getVersion() throws Throwable;



    // Instance Events section
    

}