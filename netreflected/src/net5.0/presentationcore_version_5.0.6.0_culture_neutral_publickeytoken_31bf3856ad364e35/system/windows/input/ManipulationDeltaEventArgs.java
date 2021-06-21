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

package system.windows.input;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.input.InputEventArgs;
import system.windows.input.ManipulationDelta;
import system.windows.IInputElement;
import system.windows.IInputElementImplementation;
import system.windows.input.ManipulationVelocities;
import system.windows.Point;


/**
 * The base .NET class managing System.Windows.Input.ManipulationDeltaEventArgs, PresentationCore, Version=5.0.6.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Input.ManipulationDeltaEventArgs" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Input.ManipulationDeltaEventArgs</a>
 */
public class ManipulationDeltaEventArgs extends InputEventArgs  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=5.0.6.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=5.0.6.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Input.ManipulationDeltaEventArgs
     */
    public static final String className = "System.Windows.Input.ManipulationDeltaEventArgs";
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

    public ManipulationDeltaEventArgs(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ManipulationDeltaEventArgs}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ManipulationDeltaEventArgs} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ManipulationDeltaEventArgs cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ManipulationDeltaEventArgs(from.getJCOInstance());
    }

    // Constructors section
    
    public ManipulationDeltaEventArgs() throws Throwable {
    }



    
    // Methods section
    
    public boolean Cancel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Cancel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Complete() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Complete");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void ReportBoundaryFeedback(ManipulationDelta unusedManipulation) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.ObjectDisposedException, system.RankException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("ReportBoundaryFeedback", unusedManipulation == null ? null : unusedManipulation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void StartInertia() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("StartInertia");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsInertial() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsInertial");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsInertial(boolean IsInertial) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsInertial", IsInertial);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IInputElement getManipulationContainer() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ManipulationContainer");
            return new IInputElementImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setManipulationContainer(IInputElement ManipulationContainer) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ManipulationContainer", ManipulationContainer == null ? null : ManipulationContainer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManipulationDelta getCumulativeManipulation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("CumulativeManipulation");
            return new ManipulationDelta(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCumulativeManipulation(ManipulationDelta CumulativeManipulation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CumulativeManipulation", CumulativeManipulation == null ? null : CumulativeManipulation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManipulationDelta getDeltaManipulation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DeltaManipulation");
            return new ManipulationDelta(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDeltaManipulation(ManipulationDelta DeltaManipulation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DeltaManipulation", DeltaManipulation == null ? null : DeltaManipulation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ManipulationVelocities getVelocities() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Velocities");
            return new ManipulationVelocities(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVelocities(ManipulationVelocities Velocities) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Velocities", Velocities == null ? null : Velocities.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Point getManipulationOrigin() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ManipulationOrigin");
            return new Point(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setManipulationOrigin(Point ManipulationOrigin) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ManipulationOrigin", ManipulationOrigin == null ? null : ManipulationOrigin.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}