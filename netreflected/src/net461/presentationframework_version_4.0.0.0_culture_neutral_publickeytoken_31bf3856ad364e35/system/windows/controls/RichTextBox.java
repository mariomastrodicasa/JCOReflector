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

package system.windows.controls;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.controls.primitives.TextBoxBase;
import system.windows.documents.FlowDocument;
import system.windows.controls.SpellingError;
import system.windows.documents.TextPointer;
import system.windows.documents.LogicalDirection;
import system.windows.Point;
import system.windows.documents.TextRange;
import system.windows.documents.TextSelection;
import system.windows.markup.IAddChild;
import system.windows.markup.IAddChildImplementation;


/**
 * The base .NET class managing System.Windows.Controls.RichTextBox, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Controls.RichTextBox" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Controls.RichTextBox</a>
 */
public class RichTextBox extends TextBoxBase implements system.windows.markup.IAddChild {
    /**
     * Fully assembly qualified name: PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationFramework
     */
    public static final String assemblyShortName = "PresentationFramework";
    /**
     * Qualified class name: System.Windows.Controls.RichTextBox
     */
    public static final String className = "System.Windows.Controls.RichTextBox";
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

    public RichTextBox(Object instance) throws Throwable {
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

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link RichTextBox}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link RichTextBox} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static RichTextBox cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RichTextBox(from.getJCOInstance());
    }

    // Constructors section
    
    public RichTextBox() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.PlatformNotSupportedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.security.SecurityException, system.ObjectDisposedException, system.UnauthorizedAccessException, system.io.IOException, system.OutOfMemoryException, system.windows.markup.XamlParseException, system.threading.ThreadStateException, system.RankException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RichTextBox(FlowDocument document) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.ArgumentNullException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.NotSupportedException, system.ObjectDisposedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.componentmodel.Win32Exception, system.PlatformNotSupportedException, system.componentmodel.InvalidEnumArgumentException, system.threading.ThreadStateException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.security.SecurityException, system.OutOfMemoryException, system.windows.markup.XamlParseException, system.RankException, system.OverflowException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(document == null ? null : document.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean ShouldSerializeDocument() throws Throwable, system.ArgumentException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentNullException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ShouldSerializeDocument");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SpellingError GetSpellingError(TextPointer position) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.io.IOException, system.runtime.interopservices.COMException, system.threading.SynchronizationLockException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSpellingError = (JCObject)classInstance.Invoke("GetSpellingError", position == null ? null : position.getJCOInstance());
            return new SpellingError(objGetSpellingError);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextPointer GetNextSpellingErrorPosition(TextPointer position, LogicalDirection direction) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.io.IOException, system.runtime.interopservices.COMException, system.threading.SynchronizationLockException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetNextSpellingErrorPosition = (JCObject)classInstance.Invoke("GetNextSpellingErrorPosition", position == null ? null : position.getJCOInstance(), direction == null ? null : direction.getJCOInstance());
            return new TextPointer(objGetNextSpellingErrorPosition);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextPointer GetPositionFromPoint(Point point, boolean snapToText) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.componentmodel.Win32Exception, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetPositionFromPoint = (JCObject)classInstance.Invoke("GetPositionFromPoint", point == null ? null : point.getJCOInstance(), snapToText);
            return new TextPointer(objGetPositionFromPoint);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextRange GetSpellingErrorRange(TextPointer position) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.security.SecurityException, system.io.IOException, system.runtime.interopservices.COMException, system.threading.SynchronizationLockException, system.PlatformNotSupportedException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.collections.generic.KeyNotFoundException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetSpellingErrorRange = (JCObject)classInstance.Invoke("GetSpellingErrorRange", position == null ? null : position.getJCOInstance());
            return new TextRange(objGetSpellingErrorRange);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIAddChild method available in IAddChild to obtain an object with an invocable method
     */
    @Deprecated 
    public void AddChild(NetObject value) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIAddChild to obtain the full interface.");
    }

    /**
     * @deprecated Not for public use because the method is implemented in .NET with an explicit interface.
     *    Use the static ToIAddChild method available in IAddChild to obtain an object with an invocable method
     */
    @Deprecated 
    public void AddText(java.lang.String text) throws Throwable {
        throw new UnsupportedOperationException("Not for public use because the method is implemented with an explicit interface. Use ToIAddChild to obtain the full interface.");
    }


    
    // Properties section
    
    public boolean getIsDocumentEnabled() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsDocumentEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsDocumentEnabled(boolean IsDocumentEnabled) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsDocumentEnabled", IsDocumentEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FlowDocument getDocument() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.security.SecurityException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.resources.MissingManifestResourceException, system.NotImplementedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Document");
            return new FlowDocument(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDocument(FlowDocument Document) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.globalization.CultureNotFoundException, system.RankException, system.collections.generic.KeyNotFoundException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Document", Document == null ? null : Document.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextPointer getCaretPosition() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CaretPosition");
            return new TextPointer(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCaretPosition(TextPointer CaretPosition) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CaretPosition", CaretPosition == null ? null : CaretPosition.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextSelection getSelection() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Selection");
            return new TextSelection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}