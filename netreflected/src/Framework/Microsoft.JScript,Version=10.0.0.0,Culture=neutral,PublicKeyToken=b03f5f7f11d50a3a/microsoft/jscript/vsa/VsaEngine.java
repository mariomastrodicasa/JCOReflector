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
 *      This code was generated from a template using JCOReflector version 1.0.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package microsoft.jscript.vsa;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.jscript.GlobalScope;
import system.RuntimeTypeHandle;
import system.reflection.Assembly;
import system.reflection.Module;
import microsoft.jscript.ArrayConstructor;
import microsoft.jscript.ObjectConstructor;
import microsoft.jscript.RegExpConstructor;
import microsoft.jscript.ScriptObject;
import system.AppDomain;
import microsoft.jscript.vsa.VsaEngine;
import microsoft.jscript.LenientGlobalObject;
import system.security.policy.Evidence;


/**
 * The base .NET class managing Microsoft.JScript.Vsa.VsaEngine, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class VsaEngine extends NetObject  {
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.JScript";
    public static final String className = "Microsoft.JScript.Vsa.VsaEngine";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VsaEngine(Object instance) throws Throwable {
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new Exception("Cannot manage object, it is not a JCObject");
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }

    public static VsaEngine castFrom(IJCOBridgeReflected from) throws Throwable {
        return new VsaEngine(from.getJCOInstance());
    }

    // Constructors section
    
    
    public VsaEngine() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VsaEngine(boolean fast) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject(fast);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean CompileEmpty() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        try {
            return (boolean)classInstance.Invoke("CompileEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ConnectEvents() throws Throwable {
        try {
            classInstance.Invoke("ConnectEvents");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static GlobalScope CreateEngineAndGetGlobalScopeWithType(boolean fast, java.lang.String[] assemblyNames, RuntimeTypeHandle callingTypeHandle) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.ArgumentOutOfRangeException, microsoft.jscript.vsa.JSVsaException, system.IndexOutOfRangeException, system.NotSupportedException, system.NotImplementedException, system.security.SecurityException, system.NullReferenceException {
        try {
            JCObject objCreateEngineAndGetGlobalScopeWithType = (JCObject)classType.Invoke("CreateEngineAndGetGlobalScopeWithType", fast, (Object)assemblyNames, (Object)callingTypeHandle.getJCOInstance());
            return new GlobalScope(objCreateEngineAndGetGlobalScopeWithType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DisconnectEvents() throws Throwable {
        try {
            classInstance.Invoke("DisconnectEvents");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly GetAssembly() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.FormatException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.MissingMethodException, system.reflection.TargetInvocationException {
        try {
            JCObject objGetAssembly = (JCObject)classInstance.Invoke("GetAssembly");
            return new Assembly(objGetAssembly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int GetItemCount() throws Throwable {
        try {
            return (int)classInstance.Invoke("GetItemCount");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GlobalScope GetMainScope() throws Throwable, system.ArgumentNullException, system.FormatException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.NotImplementedException, system.InvalidOperationException, system.ArgumentException {
        try {
            JCObject objGetMainScope = (JCObject)classInstance.Invoke("GetMainScope");
            return new GlobalScope(objGetMainScope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Module GetModule() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException, system.ArgumentNullException, system.InvalidOperationException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.InvalidCastException, system.NullReferenceException, system.MissingMethodException, system.FormatException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, microsoft.jscript.EndOfFile, system.TypeLoadException {
        try {
            JCObject objGetModule = (JCObject)classInstance.Invoke("GetModule");
            return new Module(objGetModule);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ArrayConstructor GetOriginalArrayConstructor() throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        try {
            JCObject objGetOriginalArrayConstructor = (JCObject)classInstance.Invoke("GetOriginalArrayConstructor");
            return new ArrayConstructor(objGetOriginalArrayConstructor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ObjectConstructor GetOriginalObjectConstructor() throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        try {
            JCObject objGetOriginalObjectConstructor = (JCObject)classInstance.Invoke("GetOriginalObjectConstructor");
            return new ObjectConstructor(objGetOriginalObjectConstructor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RegExpConstructor GetOriginalRegExpConstructor() throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        try {
            JCObject objGetOriginalRegExpConstructor = (JCObject)classInstance.Invoke("GetOriginalRegExpConstructor");
            return new RegExpConstructor(objGetOriginalRegExpConstructor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Interrupt() throws Throwable {
        try {
            classInstance.Invoke("Interrupt");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsValidIdentifier(java.lang.String ident) throws Throwable, microsoft.jscript.vsa.JSVsaException, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, microsoft.jscript.EndOfFile, system.OutOfMemoryException, system.NotSupportedException, system.NotImplementedException, system.FormatException, system.OverflowException, system.ArithmeticException, microsoft.jscript.JScriptException {
        try {
            return (boolean)classInstance.Invoke("IsValidIdentifier", (Object)ident);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ScriptObject PopScriptObject() throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        try {
            JCObject objPopScriptObject = (JCObject)classInstance.Invoke("PopScriptObject");
            return new ScriptObject(objPopScriptObject);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PushScriptObject(ScriptObject obj) throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        try {
            classInstance.Invoke("PushScriptObject", (Object)obj.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RegisterEventSource(java.lang.String name) throws Throwable {
        try {
            classInstance.Invoke("RegisterEventSource", (Object)name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Reset() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Restart() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException, system.ArgumentNullException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException {
        try {
            classInstance.Invoke("Restart");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RunEmpty() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        try {
            classInstance.Invoke("RunEmpty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Run(AppDomain domain) throws Throwable, system.NotImplementedException {
        try {
            classInstance.Invoke("Run", (Object)domain.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ScriptObject ScriptObjectStackTop() throws Throwable, system.ArgumentNullException, system.NotImplementedException {
        try {
            JCObject objScriptObjectStackTop = (JCObject)classInstance.Invoke("ScriptObjectStackTop");
            return new ScriptObject(objScriptObjectStackTop);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static GlobalScope CreateEngineAndGetGlobalScope(boolean fast, java.lang.String[] assemblyNames) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, microsoft.jscript.vsa.JSVsaException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        try {
            JCObject objCreateEngineAndGetGlobalScope = (JCObject)classType.Invoke("CreateEngineAndGetGlobalScope", fast, (Object)assemblyNames);
            return new GlobalScope(objCreateEngineAndGetGlobalScope);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static GlobalScope CreateEngineAndGetGlobalScopeWithTypeAndRootNamespace(boolean fast, java.lang.String[] assemblyNames, RuntimeTypeHandle callingTypeHandle, java.lang.String rootNamespace) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, microsoft.jscript.vsa.JSVsaException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.NotImplementedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, system.NullReferenceException {
        try {
            JCObject objCreateEngineAndGetGlobalScopeWithTypeAndRootNamespace = (JCObject)classType.Invoke("CreateEngineAndGetGlobalScopeWithTypeAndRootNamespace", fast, (Object)assemblyNames, (Object)callingTypeHandle.getJCOInstance(), (Object)rootNamespace);
            return new GlobalScope(objCreateEngineAndGetGlobalScopeWithTypeAndRootNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static VsaEngine CreateEngine() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException {
        try {
            JCObject objCreateEngine = (JCObject)classType.Invoke("CreateEngine");
            return new VsaEngine(objCreateEngine);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static VsaEngine CreateEngineWithType(RuntimeTypeHandle callingTypeHandle) throws Throwable, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, microsoft.jscript.vsa.JSVsaException, system.NotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.security.SecurityException, system.NullReferenceException {
        try {
            JCObject objCreateEngineWithType = (JCObject)classType.Invoke("CreateEngineWithType", (Object)callingTypeHandle.getJCOInstance());
            return new VsaEngine(objCreateEngineWithType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Compile() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        try {
            return (boolean)classInstance.Invoke("Compile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetOption(java.lang.String name) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        try {
            JCObject objGetOption = (JCObject)classInstance.Invoke("GetOption", (Object)name);
            return new NetObject(objGetOption);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void InitNew() throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        try {
            classInstance.Invoke("InitNew");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetOption(java.lang.String name, NetObject value) throws Throwable, system.ArgumentException, microsoft.jscript.vsa.JSVsaException {
        try {
            classInstance.Invoke("SetOption", (Object)name, (Object)value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public LenientGlobalObject getLenientGlobalObject() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LenientGlobalObject");
            return new LenientGlobalObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Evidence getEvidence() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Evidence");
            return new Evidence(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEvidence(Evidence Evidence) throws Throwable {
        try {
            classInstance.Set("Evidence", (Object)Evidence.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getApplicationBase() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("ApplicationBase");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setApplicationBase(java.lang.String ApplicationBase) throws Throwable {
        try {
            classInstance.Set("ApplicationBase", (Object)ApplicationBase);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Assembly getAssembly() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Assembly");
            return new Assembly(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getGenerateDebugInfo() throws Throwable {
        try {
            return (boolean)classInstance.Get("GenerateDebugInfo");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setGenerateDebugInfo(boolean GenerateDebugInfo) throws Throwable {
        try {
            classInstance.Set("GenerateDebugInfo", GenerateDebugInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsCompiled() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsCompiled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsDirty() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsDirty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsDirty(boolean IsDirty) throws Throwable {
        try {
            classInstance.Set("IsDirty", IsDirty);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsRunning() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsRunning");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getLanguage() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Language");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getLCID() throws Throwable {
        try {
            return (int)classInstance.Get("LCID");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLCID(int LCID) throws Throwable {
        try {
            classInstance.Set("LCID", LCID);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getName() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Name");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setName(java.lang.String Name) throws Throwable {
        try {
            classInstance.Set("Name", (Object)Name);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRootMoniker() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("RootMoniker");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRootMoniker(java.lang.String RootMoniker) throws Throwable {
        try {
            classInstance.Set("RootMoniker", (Object)RootMoniker);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getRootNamespace() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("RootNamespace");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRootNamespace(java.lang.String RootNamespace) throws Throwable {
        try {
            classInstance.Set("RootNamespace", (Object)RootNamespace);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getVersion() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("Version");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}