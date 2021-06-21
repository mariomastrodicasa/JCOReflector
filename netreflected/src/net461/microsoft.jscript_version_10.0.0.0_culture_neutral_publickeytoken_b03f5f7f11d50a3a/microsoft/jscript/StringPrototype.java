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

package microsoft.jscript;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.jscript.StringObject;
import microsoft.jscript.vsa.VsaEngine;
import microsoft.jscript.ArrayObject;
import microsoft.jscript.StringConstructor;


/**
 * The base .NET class managing Microsoft.JScript.StringPrototype, Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.StringPrototype" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.JScript.StringPrototype</a>
 */
public class StringPrototype extends StringObject  {
    /**
     * Fully assembly qualified name: Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.JScript, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.JScript
     */
    public static final String assemblyShortName = "Microsoft.JScript";
    /**
     * Qualified class name: Microsoft.JScript.StringPrototype
     */
    public static final String className = "Microsoft.JScript.StringPrototype";
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

    public StringPrototype(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link StringPrototype}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link StringPrototype} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static StringPrototype cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new StringPrototype(from.getJCOInstance());
    }

    // Constructors section
    
    public StringPrototype() throws Throwable {
    }



    
    // Methods section
    
    public static int indexOf(NetObject thisob, NetObject searchString, double position) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("indexOf", thisob == null ? null : thisob.getJCOInstance(), searchString == null ? null : searchString.getJCOInstance(), position);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int lastIndexOf(NetObject thisob, NetObject searchString, double position) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("lastIndexOf", thisob == null ? null : thisob.getJCOInstance(), searchString == null ? null : searchString.getJCOInstance(), position);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int localeCompare(NetObject thisob, NetObject thatob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("localeCompare", thisob == null ? null : thisob.getJCOInstance(), thatob == null ? null : thatob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int search(NetObject thisob, VsaEngine engine, NetObject regExp) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.text.regularexpressions.RegexMatchTimeoutException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("search", thisob == null ? null : thisob.getJCOInstance(), engine == null ? null : engine.getJCOInstance(), regExp == null ? null : regExp.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static ArrayObject split(NetObject thisob, VsaEngine engine, NetObject separator, NetObject limit) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException, system.ArithmeticException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.text.regularexpressions.RegexMatchTimeoutException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objsplit = (JCObject)classType.Invoke("split", thisob == null ? null : thisob.getJCOInstance(), engine == null ? null : engine.getJCOInstance(), separator == null ? null : separator.getJCOInstance(), limit == null ? null : limit.getJCOInstance());
            return new ArrayObject(objsplit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject charCodeAt(NetObject thisob, double pos) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objcharCodeAt = (JCObject)classType.Invoke("charCodeAt", thisob == null ? null : thisob.getJCOInstance(), pos);
            return new NetObject(objcharCodeAt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject match(NetObject thisob, VsaEngine engine, NetObject regExp) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException, system.security.SecurityException, system.text.regularexpressions.RegexMatchTimeoutException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objmatch = (JCObject)classType.Invoke("match", thisob == null ? null : thisob.getJCOInstance(), engine == null ? null : engine.getJCOInstance(), regExp == null ? null : regExp.getJCOInstance());
            return new NetObject(objmatch);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static NetObject valueOf(NetObject thisob) throws Throwable, microsoft.jscript.JScriptException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objvalueOf = (JCObject)classType.Invoke("valueOf", thisob == null ? null : thisob.getJCOInstance());
            return new NetObject(objvalueOf);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String anchor(NetObject thisob, NetObject anchorName) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("anchor", thisob == null ? null : thisob.getJCOInstance(), anchorName == null ? null : anchorName.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String big(NetObject thisob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("big", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String blink(NetObject thisob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("blink", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String bold(NetObject thisob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("bold", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String charAt(NetObject thisob, double pos) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("charAt", thisob == null ? null : thisob.getJCOInstance(), pos);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String concat(NetObject thisob, NetObject... args) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("concat", thisob == null ? null : thisob.getJCOInstance(), toObjectFromArray(args));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String fixed(NetObject thisob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("fixed", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String fontcolor(NetObject thisob, NetObject colorName) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("fontcolor", thisob == null ? null : thisob.getJCOInstance(), colorName == null ? null : colorName.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String fontsize(NetObject thisob, NetObject fontSize) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("fontsize", thisob == null ? null : thisob.getJCOInstance(), fontSize == null ? null : fontSize.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String italics(NetObject thisob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("italics", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String link(NetObject thisob, NetObject linkRef) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("link", thisob == null ? null : thisob.getJCOInstance(), linkRef == null ? null : linkRef.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String replace(NetObject thisob, NetObject regExp, NetObject replacement) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.text.regularexpressions.RegexMatchTimeoutException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("replace", thisob == null ? null : thisob.getJCOInstance(), regExp == null ? null : regExp.getJCOInstance(), replacement == null ? null : replacement.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String slice(NetObject thisob, double start, NetObject end) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("slice", thisob == null ? null : thisob.getJCOInstance(), start, end == null ? null : end.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String small(NetObject thisob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("small", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String strike(NetObject thisob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("strike", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String sub(NetObject thisob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("sub", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String substr(NetObject thisob, double start, NetObject count) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("substr", thisob == null ? null : thisob.getJCOInstance(), start, count == null ? null : count.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String substring(NetObject thisob, double start, NetObject end) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("substring", thisob == null ? null : thisob.getJCOInstance(), start, end == null ? null : end.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String sup(NetObject thisob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("sup", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String toLocaleLowerCase(NetObject thisob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("toLocaleLowerCase", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String toLocaleUpperCase(NetObject thisob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("toLocaleUpperCase", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String toLowerCase(NetObject thisob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("toLowerCase", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String toString(NetObject thisob) throws Throwable, microsoft.jscript.JScriptException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("toString", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static java.lang.String toUpperCase(NetObject thisob) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, microsoft.jscript.JScriptException, system.NotImplementedException, system.MissingMethodException, system.NullReferenceException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (java.lang.String)classType.Invoke("toUpperCase", thisob == null ? null : thisob.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static StringConstructor getconstructor() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("constructor");
            return new StringConstructor(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}