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

package system.windows.markup;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.markup.ParserContext;
import system.io.Stream;
import system.xml.XmlReader;
import system.xaml.XamlSchemaContext;
import system.componentmodel.AsyncCompletedEventHandler;


/**
 * The base .NET class managing System.Windows.Markup.XamlReader, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class XamlReader extends NetObject  {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.Markup.XamlReader";
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

    public XamlReader(Object instance) throws Throwable {
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

    public static XamlReader cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new XamlReader(from.getJCOInstance());
    }

    // Constructors section
    

    public XamlReader() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static NetObject Parse(java.lang.String xamlText) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.xml.XmlException, system.xaml.XamlSchemaException, system.NotImplementedException, system.xaml.XamlException, system.windows.markup.XamlParseException, system.componentmodel.InvalidEnumArgumentException, system.InvalidCastException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", xamlText);
            return new NetObject(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Parse(java.lang.String xamlText, ParserContext parserContext) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.xml.XmlException, system.UriFormatException, system.FormatException, system.xaml.XamlSchemaException, system.NotImplementedException, system.xaml.XamlException, system.windows.markup.XamlParseException, system.componentmodel.InvalidEnumArgumentException, system.InvalidCastException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objParse = (JCObject)classType.Invoke("Parse", xamlText, parserContext == null ? null : parserContext.getJCOInstance());
            return new NetObject(objParse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Load(Stream stream) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.xml.XmlException, system.UriFormatException, system.FormatException, system.xaml.XamlSchemaException, system.NotImplementedException, system.xaml.XamlException, system.windows.markup.XamlParseException, system.componentmodel.InvalidEnumArgumentException, system.InvalidCastException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", stream == null ? null : stream.getJCOInstance());
            return new NetObject(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Load(XmlReader reader) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.UriFormatException, system.MissingMemberException, system.xaml.XamlSchemaException, system.xml.XmlException, system.NotImplementedException, system.xaml.XamlException, system.windows.markup.XamlParseException, system.OutOfMemoryException, system.InvalidCastException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", reader == null ? null : reader.getJCOInstance());
            return new NetObject(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject Load(Stream stream, ParserContext parserContext) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.xml.XmlException, system.UriFormatException, system.FormatException, system.MissingMemberException, system.xaml.XamlSchemaException, system.NotImplementedException, system.xaml.XamlException, system.windows.markup.XamlParseException, system.InvalidCastException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", stream == null ? null : stream.getJCOInstance(), parserContext == null ? null : parserContext.getJCOInstance());
            return new NetObject(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject LoadAsync(Stream stream) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.xml.XmlException, system.UriFormatException, system.FormatException, system.MissingMemberException, system.xaml.XamlSchemaException, system.collections.generic.KeyNotFoundException, system.NotImplementedException, system.xaml.XamlException, system.windows.markup.XamlParseException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadAsync = (JCObject)classInstance.Invoke("LoadAsync", stream == null ? null : stream.getJCOInstance());
            return new NetObject(objLoadAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject LoadAsync(XmlReader reader) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.UriFormatException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.MissingMemberException, system.xaml.XamlSchemaException, system.xml.XmlException, system.collections.generic.KeyNotFoundException, system.NotImplementedException, system.xaml.XamlException, system.windows.markup.XamlParseException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadAsync = (JCObject)classInstance.Invoke("LoadAsync", reader == null ? null : reader.getJCOInstance());
            return new NetObject(objLoadAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject LoadAsync(Stream stream, ParserContext parserContext) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.xml.XmlException, system.UriFormatException, system.OutOfMemoryException, system.MissingMethodException, system.reflection.TargetInvocationException, system.MissingMemberException, system.xaml.XamlSchemaException, system.collections.generic.KeyNotFoundException, system.NotImplementedException, system.xaml.XamlException, system.windows.markup.XamlParseException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLoadAsync = (JCObject)classInstance.Invoke("LoadAsync", stream == null ? null : stream.getJCOInstance(), parserContext == null ? null : parserContext.getJCOInstance());
            return new NetObject(objLoadAsync);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CancelAsync() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CancelAsync");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static XamlSchemaContext GetWpfSchemaContext() throws Throwable, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.NotSupportedException, system.MissingMemberException, system.InvalidOperationException, system.ArgumentNullException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objGetWpfSchemaContext = (JCObject)classType.Invoke("GetWpfSchemaContext");
            return new XamlSchemaContext(objGetWpfSchemaContext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

    public void addLoadCompleted(AsyncCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("LoadCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeLoadCompleted(AsyncCompletedEventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("LoadCompleted", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}