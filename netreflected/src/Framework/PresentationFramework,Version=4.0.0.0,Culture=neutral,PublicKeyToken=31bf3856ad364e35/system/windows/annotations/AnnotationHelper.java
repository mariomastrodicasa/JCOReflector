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

package system.windows.annotations;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.annotations.Annotation;
import system.windows.annotations.AnnotationService;
import system.windows.media.Brush;
import system.windows.annotations.IAnchorInfo;
import system.windows.annotations.IAnchorInfoImplementation;


/**
 * The base .NET class managing System.Windows.Annotations.AnnotationHelper, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class AnnotationHelper extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.Annotations.AnnotationHelper";
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

    public AnnotationHelper(Object instance) throws Throwable {
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
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
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

    public static AnnotationHelper cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new AnnotationHelper(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public static Annotation CreateHighlightForSelection(AnnotationService service, java.lang.String author, Brush highlightBrush) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidCastException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.xml.XmlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateHighlightForSelection = (JCObject)classType.Invoke("CreateHighlightForSelection", service == null ? null : service.getJCOInstance(), author, highlightBrush == null ? null : highlightBrush.getJCOInstance());
            return new Annotation(objCreateHighlightForSelection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Annotation CreateInkStickyNoteForSelection(AnnotationService service, java.lang.String author) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.InvalidCastException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateInkStickyNoteForSelection = (JCObject)classType.Invoke("CreateInkStickyNoteForSelection", service == null ? null : service.getJCOInstance(), author);
            return new Annotation(objCreateInkStickyNoteForSelection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Annotation CreateTextStickyNoteForSelection(AnnotationService service, java.lang.String author) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.InvalidCastException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateTextStickyNoteForSelection = (JCObject)classType.Invoke("CreateTextStickyNoteForSelection", service == null ? null : service.getJCOInstance(), author);
            return new Annotation(objCreateTextStickyNoteForSelection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static IAnchorInfo GetAnchorInfo(AnnotationService service, Annotation annotation) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.MissingMethodException, system.security.SecurityException, system.IndexOutOfRangeException, system.UnauthorizedAccessException, system.io.IOException, system.MulticastNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetAnchorInfo = (JCObject)classType.Invoke("GetAnchorInfo", service == null ? null : service.getJCOInstance(), annotation == null ? null : annotation.getJCOInstance());
            return new IAnchorInfoImplementation(objGetAnchorInfo);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void ClearHighlightsForSelection(AnnotationService service) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidCastException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.xml.XmlException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("ClearHighlightsForSelection", service == null ? null : service.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DeleteInkStickyNotesForSelection(AnnotationService service) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidCastException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DeleteInkStickyNotesForSelection", service == null ? null : service.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static void DeleteTextStickyNotesForSelection(AnnotationService service) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidCastException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            classType.Invoke("DeleteTextStickyNotesForSelection", service == null ? null : service.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}