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

package system.numerics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Single;
import system.IFormatProvider;
import system.IFormatProviderImplementation;
import system.numerics.Vector2;
import system.numerics.Matrix3x2;
import system.numerics.Matrix4x4;
import system.numerics.Quaternion;


/**
 * The base .NET class managing System.Numerics.Vector2, System.Numerics.Vectors, Version=4.1.6.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class Vector2 extends NetObject  {
    public static final String assemblyFullName = "System.Numerics.Vectors, Version=4.1.6.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Numerics.Vectors";
    public static final String className = "System.Numerics.Vector2";
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

    public Vector2(Object instance) throws Throwable {
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

    public static Vector2 cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Vector2(from.getJCOInstance());
    }

    // Constructors section
    

    public Vector2(Single value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value == null ? null : value.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Vector2(Single x, Single y) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(x == null ? null : x.getJCOInstance(), y == null ? null : y.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public java.lang.String ToString(java.lang.String format) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.PlatformNotSupportedException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ToString", format);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String ToString(java.lang.String format, IFormatProvider formatProvider) throws Throwable, system.PlatformNotSupportedException, system.ArgumentNullException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Invoke("ToString", format, formatProvider == null ? null : formatProvider.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single Length() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLength = (JCObject)classInstance.Invoke("Length");
            return new Single(objLength);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single LengthSquared() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objLengthSquared = (JCObject)classInstance.Invoke("LengthSquared");
            return new Single(objLengthSquared);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single Distance(Vector2 value1, Vector2 value2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDistance = (JCObject)classType.Invoke("Distance", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
            return new Single(objDistance);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single DistanceSquared(Vector2 value1, Vector2 value2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDistanceSquared = (JCObject)classType.Invoke("DistanceSquared", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
            return new Single(objDistanceSquared);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Normalize(Vector2 value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNormalize = (JCObject)classType.Invoke("Normalize", value == null ? null : value.getJCOInstance());
            return new Vector2(objNormalize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Reflect(Vector2 vector, Vector2 normal) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objReflect = (JCObject)classType.Invoke("Reflect", vector == null ? null : vector.getJCOInstance(), normal == null ? null : normal.getJCOInstance());
            return new Vector2(objReflect);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Clamp(Vector2 value1, Vector2 min, Vector2 max) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objClamp = (JCObject)classType.Invoke("Clamp", value1 == null ? null : value1.getJCOInstance(), min == null ? null : min.getJCOInstance(), max == null ? null : max.getJCOInstance());
            return new Vector2(objClamp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Lerp(Vector2 value1, Vector2 value2, Single amount) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLerp = (JCObject)classType.Invoke("Lerp", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance(), amount == null ? null : amount.getJCOInstance());
            return new Vector2(objLerp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Transform(Vector2 position, Matrix3x2 matrix) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTransform = (JCObject)classType.Invoke("Transform", position == null ? null : position.getJCOInstance(), matrix == null ? null : matrix.getJCOInstance());
            return new Vector2(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Transform(Vector2 position, Matrix4x4 matrix) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTransform = (JCObject)classType.Invoke("Transform", position == null ? null : position.getJCOInstance(), matrix == null ? null : matrix.getJCOInstance());
            return new Vector2(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 TransformNormal(Vector2 normal, Matrix3x2 matrix) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTransformNormal = (JCObject)classType.Invoke("TransformNormal", normal == null ? null : normal.getJCOInstance(), matrix == null ? null : matrix.getJCOInstance());
            return new Vector2(objTransformNormal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 TransformNormal(Vector2 normal, Matrix4x4 matrix) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTransformNormal = (JCObject)classType.Invoke("TransformNormal", normal == null ? null : normal.getJCOInstance(), matrix == null ? null : matrix.getJCOInstance());
            return new Vector2(objTransformNormal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Transform(Vector2 value, Quaternion rotation) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTransform = (JCObject)classType.Invoke("Transform", value == null ? null : value.getJCOInstance(), rotation == null ? null : rotation.getJCOInstance());
            return new Vector2(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Add(Vector2 left, Vector2 right) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance());
            return new Vector2(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Subtract(Vector2 left, Vector2 right) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance());
            return new Vector2(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Multiply(Vector2 left, Vector2 right) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance());
            return new Vector2(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Multiply(Vector2 left, Single right) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance());
            return new Vector2(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Multiply(Single left, Vector2 right) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance());
            return new Vector2(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Divide(Vector2 left, Vector2 right) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDivide = (JCObject)classType.Invoke("Divide", left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance());
            return new Vector2(objDivide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Divide(Vector2 left, Single divisor) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDivide = (JCObject)classType.Invoke("Divide", left == null ? null : left.getJCOInstance(), divisor == null ? null : divisor.getJCOInstance());
            return new Vector2(objDivide);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Negate(Vector2 value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNegate = (JCObject)classType.Invoke("Negate", value == null ? null : value.getJCOInstance());
            return new Vector2(objNegate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(Single[] array) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CopyTo", (Object)toObjectFromArray(array));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(Single[] array, int index) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CopyTo", toObjectFromArray(array), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Equals(Vector2 other) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single Dot(Vector2 value1, Vector2 value2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objDot = (JCObject)classType.Invoke("Dot", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
            return new Single(objDot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Min(Vector2 value1, Vector2 value2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMin = (JCObject)classType.Invoke("Min", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
            return new Vector2(objMin);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Max(Vector2 value1, Vector2 value2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMax = (JCObject)classType.Invoke("Max", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
            return new Vector2(objMax);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 Abs(Vector2 value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAbs = (JCObject)classType.Invoke("Abs", value == null ? null : value.getJCOInstance());
            return new Vector2(objAbs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 SquareRoot(Vector2 value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSquareRoot = (JCObject)classType.Invoke("SquareRoot", value == null ? null : value.getJCOInstance());
            return new Vector2(objSquareRoot);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public static Vector2 getZero() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Zero");
            return new Vector2(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 getOne() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("One");
            return new Vector2(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 getUnitX() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("UnitX");
            return new Vector2(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Vector2 getUnitY() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("UnitY");
            return new Vector2(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}