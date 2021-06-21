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

package system.numerics;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.ValueType;
import system.Single;
import system.numerics.Matrix3x2;
import system.numerics.Matrix4x4;
import system.numerics.Vector3;
import system.numerics.Quaternion;
import system.numerics.Plane;


/**
 * The base .NET class managing System.Numerics.Matrix4x4, System.Numerics.Vectors, Version=4.1.6.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Numerics.Matrix4x4" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Numerics.Matrix4x4</a>
 */
public class Matrix4x4 extends ValueType  {
    /**
     * Fully assembly qualified name: System.Numerics.Vectors, Version=4.1.6.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Numerics.Vectors, Version=4.1.6.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Numerics.Vectors
     */
    public static final String assemblyShortName = "System.Numerics.Vectors";
    /**
     * Qualified class name: System.Numerics.Matrix4x4
     */
    public static final String className = "System.Numerics.Matrix4x4";
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

    public Matrix4x4(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Matrix4x4}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Matrix4x4} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Matrix4x4 cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Matrix4x4(from.getJCOInstance());
    }

    // Constructors section
    
    public Matrix4x4() throws Throwable {
    }

    public Matrix4x4(Single m11, Single m12, Single m13, Single m14, Single m21, Single m22, Single m23, Single m24, Single m31, Single m32, Single m33, Single m34, Single m41, Single m42, Single m43, Single m44) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(m11 == null ? null : m11.getJCOInstance(), m12 == null ? null : m12.getJCOInstance(), m13 == null ? null : m13.getJCOInstance(), m14 == null ? null : m14.getJCOInstance(), m21 == null ? null : m21.getJCOInstance(), m22 == null ? null : m22.getJCOInstance(), m23 == null ? null : m23.getJCOInstance(), m24 == null ? null : m24.getJCOInstance(), m31 == null ? null : m31.getJCOInstance(), m32 == null ? null : m32.getJCOInstance(), m33 == null ? null : m33.getJCOInstance(), m34 == null ? null : m34.getJCOInstance(), m41 == null ? null : m41.getJCOInstance(), m42 == null ? null : m42.getJCOInstance(), m43 == null ? null : m43.getJCOInstance(), m44 == null ? null : m44.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Matrix4x4(Matrix3x2 value) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(value == null ? null : value.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    
    // Methods section
    
    public boolean Equals(Matrix4x4 other) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Equals", other == null ? null : other.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single GetDeterminant() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetDeterminant = (JCObject)classInstance.Invoke("GetDeterminant");
            return new Single(objGetDeterminant);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 Add(Matrix4x4 value1, Matrix4x4 value2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAdd = (JCObject)classType.Invoke("Add", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
            return new Matrix4x4(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateBillboard(Vector3 objectPosition, Vector3 cameraPosition, Vector3 cameraUpVector, Vector3 cameraForwardVector) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateBillboard = (JCObject)classType.Invoke("CreateBillboard", objectPosition == null ? null : objectPosition.getJCOInstance(), cameraPosition == null ? null : cameraPosition.getJCOInstance(), cameraUpVector == null ? null : cameraUpVector.getJCOInstance(), cameraForwardVector == null ? null : cameraForwardVector.getJCOInstance());
            return new Matrix4x4(objCreateBillboard);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateConstrainedBillboard(Vector3 objectPosition, Vector3 cameraPosition, Vector3 rotateAxis, Vector3 cameraForwardVector, Vector3 objectForwardVector) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateConstrainedBillboard = (JCObject)classType.Invoke("CreateConstrainedBillboard", objectPosition == null ? null : objectPosition.getJCOInstance(), cameraPosition == null ? null : cameraPosition.getJCOInstance(), rotateAxis == null ? null : rotateAxis.getJCOInstance(), cameraForwardVector == null ? null : cameraForwardVector.getJCOInstance(), objectForwardVector == null ? null : objectForwardVector.getJCOInstance());
            return new Matrix4x4(objCreateConstrainedBillboard);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateFromAxisAngle(Vector3 axis, Single angle) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromAxisAngle = (JCObject)classType.Invoke("CreateFromAxisAngle", axis == null ? null : axis.getJCOInstance(), angle == null ? null : angle.getJCOInstance());
            return new Matrix4x4(objCreateFromAxisAngle);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateFromQuaternion(Quaternion quaternion) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromQuaternion = (JCObject)classType.Invoke("CreateFromQuaternion", quaternion == null ? null : quaternion.getJCOInstance());
            return new Matrix4x4(objCreateFromQuaternion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateFromYawPitchRoll(Single yaw, Single pitch, Single roll) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateFromYawPitchRoll = (JCObject)classType.Invoke("CreateFromYawPitchRoll", yaw == null ? null : yaw.getJCOInstance(), pitch == null ? null : pitch.getJCOInstance(), roll == null ? null : roll.getJCOInstance());
            return new Matrix4x4(objCreateFromYawPitchRoll);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateLookAt(Vector3 cameraPosition, Vector3 cameraTarget, Vector3 cameraUpVector) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateLookAt = (JCObject)classType.Invoke("CreateLookAt", cameraPosition == null ? null : cameraPosition.getJCOInstance(), cameraTarget == null ? null : cameraTarget.getJCOInstance(), cameraUpVector == null ? null : cameraUpVector.getJCOInstance());
            return new Matrix4x4(objCreateLookAt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateOrthographic(Single width, Single height, Single zNearPlane, Single zFarPlane) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateOrthographic = (JCObject)classType.Invoke("CreateOrthographic", width == null ? null : width.getJCOInstance(), height == null ? null : height.getJCOInstance(), zNearPlane == null ? null : zNearPlane.getJCOInstance(), zFarPlane == null ? null : zFarPlane.getJCOInstance());
            return new Matrix4x4(objCreateOrthographic);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateOrthographicOffCenter(Single left, Single right, Single bottom, Single top, Single zNearPlane, Single zFarPlane) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateOrthographicOffCenter = (JCObject)classType.Invoke("CreateOrthographicOffCenter", left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance(), bottom == null ? null : bottom.getJCOInstance(), top == null ? null : top.getJCOInstance(), zNearPlane == null ? null : zNearPlane.getJCOInstance(), zFarPlane == null ? null : zFarPlane.getJCOInstance());
            return new Matrix4x4(objCreateOrthographicOffCenter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreatePerspective(Single width, Single height, Single nearPlaneDistance, Single farPlaneDistance) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreatePerspective = (JCObject)classType.Invoke("CreatePerspective", width == null ? null : width.getJCOInstance(), height == null ? null : height.getJCOInstance(), nearPlaneDistance == null ? null : nearPlaneDistance.getJCOInstance(), farPlaneDistance == null ? null : farPlaneDistance.getJCOInstance());
            return new Matrix4x4(objCreatePerspective);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreatePerspectiveFieldOfView(Single fieldOfView, Single aspectRatio, Single nearPlaneDistance, Single farPlaneDistance) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreatePerspectiveFieldOfView = (JCObject)classType.Invoke("CreatePerspectiveFieldOfView", fieldOfView == null ? null : fieldOfView.getJCOInstance(), aspectRatio == null ? null : aspectRatio.getJCOInstance(), nearPlaneDistance == null ? null : nearPlaneDistance.getJCOInstance(), farPlaneDistance == null ? null : farPlaneDistance.getJCOInstance());
            return new Matrix4x4(objCreatePerspectiveFieldOfView);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreatePerspectiveOffCenter(Single left, Single right, Single bottom, Single top, Single nearPlaneDistance, Single farPlaneDistance) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreatePerspectiveOffCenter = (JCObject)classType.Invoke("CreatePerspectiveOffCenter", left == null ? null : left.getJCOInstance(), right == null ? null : right.getJCOInstance(), bottom == null ? null : bottom.getJCOInstance(), top == null ? null : top.getJCOInstance(), nearPlaneDistance == null ? null : nearPlaneDistance.getJCOInstance(), farPlaneDistance == null ? null : farPlaneDistance.getJCOInstance());
            return new Matrix4x4(objCreatePerspectiveOffCenter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateReflection(Plane value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateReflection = (JCObject)classType.Invoke("CreateReflection", value == null ? null : value.getJCOInstance());
            return new Matrix4x4(objCreateReflection);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateRotationX(Single radians) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateRotationX = (JCObject)classType.Invoke("CreateRotationX", radians == null ? null : radians.getJCOInstance());
            return new Matrix4x4(objCreateRotationX);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateRotationX(Single radians, Vector3 centerPoint) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateRotationX = (JCObject)classType.Invoke("CreateRotationX", radians == null ? null : radians.getJCOInstance(), centerPoint == null ? null : centerPoint.getJCOInstance());
            return new Matrix4x4(objCreateRotationX);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateRotationY(Single radians) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateRotationY = (JCObject)classType.Invoke("CreateRotationY", radians == null ? null : radians.getJCOInstance());
            return new Matrix4x4(objCreateRotationY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateRotationY(Single radians, Vector3 centerPoint) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateRotationY = (JCObject)classType.Invoke("CreateRotationY", radians == null ? null : radians.getJCOInstance(), centerPoint == null ? null : centerPoint.getJCOInstance());
            return new Matrix4x4(objCreateRotationY);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateRotationZ(Single radians) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateRotationZ = (JCObject)classType.Invoke("CreateRotationZ", radians == null ? null : radians.getJCOInstance());
            return new Matrix4x4(objCreateRotationZ);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateRotationZ(Single radians, Vector3 centerPoint) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateRotationZ = (JCObject)classType.Invoke("CreateRotationZ", radians == null ? null : radians.getJCOInstance(), centerPoint == null ? null : centerPoint.getJCOInstance());
            return new Matrix4x4(objCreateRotationZ);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateScale(Single scale) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateScale = (JCObject)classType.Invoke("CreateScale", scale == null ? null : scale.getJCOInstance());
            return new Matrix4x4(objCreateScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateScale(Single xScale, Single yScale, Single zScale) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateScale = (JCObject)classType.Invoke("CreateScale", xScale == null ? null : xScale.getJCOInstance(), yScale == null ? null : yScale.getJCOInstance(), zScale == null ? null : zScale.getJCOInstance());
            return new Matrix4x4(objCreateScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateScale(Single xScale, Single yScale, Single zScale, Vector3 centerPoint) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateScale = (JCObject)classType.Invoke("CreateScale", xScale == null ? null : xScale.getJCOInstance(), yScale == null ? null : yScale.getJCOInstance(), zScale == null ? null : zScale.getJCOInstance(), centerPoint == null ? null : centerPoint.getJCOInstance());
            return new Matrix4x4(objCreateScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateScale(Single scale, Vector3 centerPoint) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateScale = (JCObject)classType.Invoke("CreateScale", scale == null ? null : scale.getJCOInstance(), centerPoint == null ? null : centerPoint.getJCOInstance());
            return new Matrix4x4(objCreateScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateScale(Vector3 scales) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateScale = (JCObject)classType.Invoke("CreateScale", scales == null ? null : scales.getJCOInstance());
            return new Matrix4x4(objCreateScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateScale(Vector3 scales, Vector3 centerPoint) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateScale = (JCObject)classType.Invoke("CreateScale", scales == null ? null : scales.getJCOInstance(), centerPoint == null ? null : centerPoint.getJCOInstance());
            return new Matrix4x4(objCreateScale);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateShadow(Vector3 lightDirection, Plane plane) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateShadow = (JCObject)classType.Invoke("CreateShadow", lightDirection == null ? null : lightDirection.getJCOInstance(), plane == null ? null : plane.getJCOInstance());
            return new Matrix4x4(objCreateShadow);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateTranslation(Single xPosition, Single yPosition, Single zPosition) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateTranslation = (JCObject)classType.Invoke("CreateTranslation", xPosition == null ? null : xPosition.getJCOInstance(), yPosition == null ? null : yPosition.getJCOInstance(), zPosition == null ? null : zPosition.getJCOInstance());
            return new Matrix4x4(objCreateTranslation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateTranslation(Vector3 position) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateTranslation = (JCObject)classType.Invoke("CreateTranslation", position == null ? null : position.getJCOInstance());
            return new Matrix4x4(objCreateTranslation);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 CreateWorld(Vector3 position, Vector3 forward, Vector3 up) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCreateWorld = (JCObject)classType.Invoke("CreateWorld", position == null ? null : position.getJCOInstance(), forward == null ? null : forward.getJCOInstance(), up == null ? null : up.getJCOInstance());
            return new Matrix4x4(objCreateWorld);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 Lerp(Matrix4x4 matrix1, Matrix4x4 matrix2, Single amount) throws Throwable, system.ArgumentException, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLerp = (JCObject)classType.Invoke("Lerp", matrix1 == null ? null : matrix1.getJCOInstance(), matrix2 == null ? null : matrix2.getJCOInstance(), amount == null ? null : amount.getJCOInstance());
            return new Matrix4x4(objLerp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 Multiply(Matrix4x4 value1, Single value2) throws Throwable, system.PlatformNotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
            return new Matrix4x4(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 Multiply(Matrix4x4 value1, Matrix4x4 value2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMultiply = (JCObject)classType.Invoke("Multiply", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
            return new Matrix4x4(objMultiply);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 Negate(Matrix4x4 value) throws Throwable, system.ArgumentException, system.NotSupportedException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objNegate = (JCObject)classType.Invoke("Negate", value == null ? null : value.getJCOInstance());
            return new Matrix4x4(objNegate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 Subtract(Matrix4x4 value1, Matrix4x4 value2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objSubtract = (JCObject)classType.Invoke("Subtract", value1 == null ? null : value1.getJCOInstance(), value2 == null ? null : value2.getJCOInstance());
            return new Matrix4x4(objSubtract);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 Transform(Matrix4x4 value, Quaternion rotation) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTransform = (JCObject)classType.Invoke("Transform", value == null ? null : value.getJCOInstance(), rotation == null ? null : rotation.getJCOInstance());
            return new Matrix4x4(objTransform);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 Transpose(Matrix4x4 matrix) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTranspose = (JCObject)classType.Invoke("Transpose", matrix == null ? null : matrix.getJCOInstance());
            return new Matrix4x4(objTranspose);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsIdentity() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsIdentity");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Matrix4x4 getIdentity() throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject val = (JCObject)classType.Get("Identity");
            return new Matrix4x4(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Vector3 getTranslation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Translation");
            return new Vector3(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTranslation(Vector3 Translation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Translation", Translation == null ? null : Translation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}