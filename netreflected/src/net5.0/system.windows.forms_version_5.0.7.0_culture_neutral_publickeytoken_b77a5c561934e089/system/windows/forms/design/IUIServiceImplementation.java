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

package system.windows.forms.design;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.IWin32Window;
import system.windows.forms.IWin32WindowImplementation;
import system.Guid;
import system.windows.forms.DialogResult;
import system.windows.forms.Form;
import system.windows.forms.MessageBoxButtons;
import system.collections.IDictionary;
import system.collections.IDictionaryImplementation;


/**
 * The base .NET class managing System.Windows.Forms.Design.IUIService, System.Windows.Forms, Version=5.0.7.0, Culture=neutral, PublicKeyToken=b77a5c561934e089.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.Design.IUIService" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Forms.Design.IUIService</a>
 */
public class IUIServiceImplementation extends NetObject implements IUIService {
    /**
     * Fully assembly qualified name: System.Windows.Forms, Version=5.0.7.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "System.Windows.Forms, Version=5.0.7.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: System.Windows.Forms
     */
    public static final String assemblyShortName = "System.Windows.Forms";
    /**
     * Qualified class name: System.Windows.Forms.Design.IUIService
     */
    public static final String className = "System.Windows.Forms.Design.IUIService";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            String classToCreate = className + ", "
                    + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Creating %s", classToCreate);
            JCType typeCreated = bridge.GetType(classToCreate);
            if (JCOReflector.getDebug())
                JCOReflector.writeLog("Created: %s",
                        (typeCreated != null) ? typeCreated.toString() : "Returned null value");
            return typeCreated;
        } catch (JCException e) {
            JCOReflector.writeLog(e);
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

    public IUIServiceImplementation(Object instance) throws Throwable {
        super(instance);
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
        return className + ", " + (JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link IUIService}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link IUIService} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static IUIService ToIUIService(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IUIServiceImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public boolean CanShowComponentEditor(NetObject component) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("CanShowComponentEditor", component == null ? null : component.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShowComponentEditor(NetObject component, IWin32Window parent) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShowComponentEditor", component == null ? null : component.getJCOInstance(), parent == null ? null : parent.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ShowToolWindow(Guid toolWindow) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShowToolWindow", toolWindow == null ? null : toolWindow.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DialogResult ShowDialog(Form form) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objShowDialog = (JCObject)classInstance.Invoke("ShowDialog", form == null ? null : form.getJCOInstance());
            return new DialogResult(objShowDialog);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DialogResult ShowMessage(java.lang.String message, java.lang.String caption, MessageBoxButtons buttons) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objShowMessage = (JCObject)classInstance.Invoke("ShowMessage", message, caption, buttons == null ? null : buttons.getJCOInstance());
            return new DialogResult(objShowMessage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IWin32Window GetDialogOwnerWindow() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDialogOwnerWindow = (JCObject)classInstance.Invoke("GetDialogOwnerWindow");
            return new IWin32WindowImplementation(objGetDialogOwnerWindow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetUIDirty() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SetUIDirty");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowError(NetException ex) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShowError", ex == null ? null : ex.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowError(NetException ex, java.lang.String message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShowError", ex == null ? null : ex.getJCOInstance(), message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowError(java.lang.String message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShowError", message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowMessage(java.lang.String message) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShowMessage", message);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ShowMessage(java.lang.String message, java.lang.String caption) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ShowMessage", message, caption);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public IDictionary getStyles() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Styles");
            return new IDictionaryImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}