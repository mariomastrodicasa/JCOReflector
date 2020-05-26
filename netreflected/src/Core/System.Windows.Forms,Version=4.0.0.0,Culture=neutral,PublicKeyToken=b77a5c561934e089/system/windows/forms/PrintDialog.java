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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.DialogResult;
import system.drawing.printing.PrintDocument;
import system.drawing.printing.PrinterSettings;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Forms.PrintDialog, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class PrintDialog extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.PrintDialog";
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

    public PrintDialog(Object instance) throws Throwable {
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

    public static PrintDialog castFrom(IJCOBridgeReflected from) throws Throwable {
        return new PrintDialog(from.getJCOInstance());
    }

    // Constructors section
    
    
    public PrintDialog() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public void Reset() throws Throwable {
        try {
            classInstance.Invoke("Reset");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DialogResult ShowDialog() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.NotSupportedException, system.OutOfMemoryException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.FormatException, system.io.FileNotFoundException, system.componentmodel.InvalidEnumArgumentException {
        try {
            JCObject objShowDialog = (JCObject)classInstance.Invoke("ShowDialog");
            return new DialogResult(objShowDialog);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objGetLifetimeService = (JCObject)classInstance.Invoke("GetLifetimeService");
            return new NetObject(objGetLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject InitializeLifetimeService() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.NotSupportedException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        try {
            JCObject objInitializeLifetimeService = (JCObject)classInstance.Invoke("InitializeLifetimeService");
            return new NetObject(objInitializeLifetimeService);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getAllowCurrentPage() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowCurrentPage");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowCurrentPage(boolean AllowCurrentPage) throws Throwable {
        try {
            classInstance.Set("AllowCurrentPage", AllowCurrentPage);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowSomePages() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowSomePages");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowSomePages(boolean AllowSomePages) throws Throwable {
        try {
            classInstance.Set("AllowSomePages", AllowSomePages);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowPrintToFile() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowPrintToFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowPrintToFile(boolean AllowPrintToFile) throws Throwable {
        try {
            classInstance.Set("AllowPrintToFile", AllowPrintToFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowSelection() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowSelection");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowSelection(boolean AllowSelection) throws Throwable {
        try {
            classInstance.Set("AllowSelection", AllowSelection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PrintDocument getDocument() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Document");
            return new PrintDocument(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDocument(PrintDocument Document) throws Throwable {
        try {
            classInstance.Set("Document", (Object)Document.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public PrinterSettings getPrinterSettings() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("PrinterSettings");
            return new PrinterSettings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrinterSettings(PrinterSettings PrinterSettings) throws Throwable {
        try {
            classInstance.Set("PrinterSettings", (Object)PrinterSettings.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPrintToFile() throws Throwable {
        try {
            return (boolean)classInstance.Get("PrintToFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPrintToFile(boolean PrintToFile) throws Throwable {
        try {
            classInstance.Set("PrintToFile", PrintToFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowHelp() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShowHelp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowHelp(boolean ShowHelp) throws Throwable {
        try {
            classInstance.Set("ShowHelp", ShowHelp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getShowNetwork() throws Throwable {
        try {
            return (boolean)classInstance.Get("ShowNetwork");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setShowNetwork(boolean ShowNetwork) throws Throwable {
        try {
            classInstance.Set("ShowNetwork", ShowNetwork);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseEXDialog() throws Throwable {
        try {
            return (boolean)classInstance.Get("UseEXDialog");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseEXDialog(boolean UseEXDialog) throws Throwable {
        try {
            classInstance.Set("UseEXDialog", UseEXDialog);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getTag() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("Tag");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTag(NetObject Tag) throws Throwable {
        try {
            classInstance.Set("Tag", (Object)Tag.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addHelpRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("HelpRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeHelpRequest(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("HelpRequest", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void addDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeDisposed(EventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("Disposed", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}