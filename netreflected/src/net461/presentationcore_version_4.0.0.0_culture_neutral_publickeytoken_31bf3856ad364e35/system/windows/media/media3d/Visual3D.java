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

package system.windows.media.media3d;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.DependencyObject;
import system.windows.DependencyProperty;
import system.windows.media.media3d.GeneralTransform3D;
import system.windows.media.media3d.Visual3D;
import system.windows.media.media3d.GeneralTransform3DTo2D;
import system.windows.media.Visual;
import system.windows.media.animation.AnimationClock;
import system.windows.media.animation.HandoffBehavior;
import system.windows.media.animation.AnimationTimeline;
import system.windows.media.media3d.Transform3D;


/**
 * The base .NET class managing System.Windows.Media.Media3D.Visual3D, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Media3D.Visual3D" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Media3D.Visual3D</a>
 */
public class Visual3D extends DependencyObject  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Media.Media3D.Visual3D
     */
    public static final String className = "System.Windows.Media.Media3D.Visual3D";
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

    public Visual3D(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Visual3D}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Visual3D} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Visual3D cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Visual3D(from.getJCOInstance());
    }

    // Constructors section
    
    public Visual3D() throws Throwable {
    }

    
    // Methods section
    
    public boolean IsAncestorOf(DependencyObject descendant) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsAncestorOf", descendant == null ? null : descendant.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean IsDescendantOf(DependencyObject ancestor) throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("IsDescendantOf", ancestor == null ? null : ancestor.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject GetAnimationBaseValue(DependencyProperty dp) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.InvalidOperationException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.security.SecurityException, system.io.IOException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAnimationBaseValue = (JCObject)classInstance.Invoke("GetAnimationBaseValue", dp == null ? null : dp.getJCOInstance());
            return new NetObject(objGetAnimationBaseValue);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependencyObject FindCommonVisualAncestor(DependencyObject otherVisual) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindCommonVisualAncestor = (JCObject)classInstance.Invoke("FindCommonVisualAncestor", otherVisual == null ? null : otherVisual.getJCOInstance());
            return new DependencyObject(objFindCommonVisualAncestor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GeneralTransform3D TransformToAncestor(Visual3D ancestor) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTransformToAncestor = (JCObject)classInstance.Invoke("TransformToAncestor", ancestor == null ? null : ancestor.getJCOInstance());
            return new GeneralTransform3D(objTransformToAncestor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GeneralTransform3D TransformToDescendant(Visual3D descendant) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTransformToDescendant = (JCObject)classInstance.Invoke("TransformToDescendant", descendant == null ? null : descendant.getJCOInstance());
            return new GeneralTransform3D(objTransformToDescendant);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GeneralTransform3DTo2D TransformToAncestor(Visual ancestor) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.componentmodel.Win32Exception {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objTransformToAncestor = (JCObject)classInstance.Invoke("TransformToAncestor", ancestor == null ? null : ancestor.getJCOInstance());
            return new GeneralTransform3DTo2D(objTransformToAncestor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ApplyAnimationClock(DependencyProperty dp, AnimationClock clock) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ApplyAnimationClock", dp == null ? null : dp.getJCOInstance(), clock == null ? null : clock.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ApplyAnimationClock(DependencyProperty dp, AnimationClock clock, HandoffBehavior handoffBehavior) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.MulticastNotSupportedException, system.windows.media.animation.AnimationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ApplyAnimationClock", dp == null ? null : dp.getJCOInstance(), clock == null ? null : clock.getJCOInstance(), handoffBehavior == null ? null : handoffBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginAnimation(DependencyProperty dp, AnimationTimeline animation) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException, system.MulticastNotSupportedException, system.windows.media.animation.AnimationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("BeginAnimation", dp == null ? null : dp.getJCOInstance(), animation == null ? null : animation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void BeginAnimation(DependencyProperty dp, AnimationTimeline animation, HandoffBehavior handoffBehavior) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.componentmodel.Win32Exception, system.windows.media.animation.AnimationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("BeginAnimation", dp == null ? null : dp.getJCOInstance(), animation == null ? null : animation.getJCOInstance(), handoffBehavior == null ? null : handoffBehavior.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getHasAnimatedProperties() throws Throwable, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HasAnimatedProperties");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Transform3D getTransform() throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Transform");
            return new Transform3D(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransform(Transform3D Transform) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ArgumentException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Transform", Transform == null ? null : Transform.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}