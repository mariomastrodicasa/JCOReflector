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

package system.windows.controls.primitives;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.controls.ItemContainerGenerator;
import system.windows.controls.Panel;
import system.IDisposable;
import system.IDisposableImplementation;
import system.windows.controls.primitives.GeneratorPosition;
import system.windows.controls.primitives.GeneratorDirection;
import system.windows.DependencyObject;


/**
 * The base .NET class managing System.Windows.Controls.Primitives.IItemContainerGenerator, PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class IItemContainerGeneratorImplementation extends NetObject implements IItemContainerGenerator {
    public static final String assemblyFullName = "PresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    public static final String assemblyShortName = "PresentationFramework";
    public static final String className = "System.Windows.Controls.Primitives.IItemContainerGenerator";
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

    public IItemContainerGeneratorImplementation(Object instance) throws Throwable {
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

    public JCType getJCOType() {
        return classType;
    }

    public static IItemContainerGenerator ToIItemContainerGenerator(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new IItemContainerGeneratorImplementation(from.getJCOInstance());
    }

    // Methods section
    
    public ItemContainerGenerator GetItemContainerGeneratorForPanel(Panel panel) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetItemContainerGeneratorForPanel = (JCObject)classInstance.Invoke("GetItemContainerGeneratorForPanel", panel == null ? null : panel.getJCOInstance());
            return new ItemContainerGenerator(objGetItemContainerGeneratorForPanel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDisposable StartAt(GeneratorPosition position, GeneratorDirection direction) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objStartAt = (JCObject)classInstance.Invoke("StartAt", position == null ? null : position.getJCOInstance(), direction == null ? null : direction.getJCOInstance());
            return new IDisposableImplementation(objStartAt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDisposable StartAt(GeneratorPosition position, GeneratorDirection direction, boolean allowStartAtRealizedItem) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objStartAt = (JCObject)classInstance.Invoke("StartAt", position == null ? null : position.getJCOInstance(), direction == null ? null : direction.getJCOInstance(), allowStartAtRealizedItem);
            return new IDisposableImplementation(objStartAt);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DependencyObject GenerateNext() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGenerateNext = (JCObject)classInstance.Invoke("GenerateNext");
            return new DependencyObject(objGenerateNext);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void PrepareItemContainer(DependencyObject container) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("PrepareItemContainer", container == null ? null : container.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAll() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveAll");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove(GeneratorPosition position, int count) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Remove", position == null ? null : position.getJCOInstance(), count);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public GeneratorPosition GeneratorPositionFromIndex(int itemIndex) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGeneratorPositionFromIndex = (JCObject)classInstance.Invoke("GeneratorPositionFromIndex", itemIndex);
            return new GeneratorPosition(objGeneratorPositionFromIndex);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexFromGeneratorPosition(GeneratorPosition position) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("IndexFromGeneratorPosition", position == null ? null : position.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}