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

package system.windows.forms;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.forms.ToolStrip;
import system.windows.forms.ToolStripItem;
import system.drawing.Image;
import system.EventHandler;
import system.windows.forms.ToolStripItemCollection;
import system.Array;


/**
 * The base .NET class managing System.Windows.Forms.ToolStripItemCollection, System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class ToolStripItemCollection extends NetObject  {
    public static final String assemblyFullName = "System.Windows.Forms, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Windows.Forms";
    public static final String className = "System.Windows.Forms.ToolStripItemCollection";
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

    public ToolStripItemCollection(Object instance) throws Throwable {
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

    public static ToolStripItemCollection cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ToolStripItemCollection(from.getJCOInstance());
    }

    // Constructors section
    

    public ToolStripItemCollection(ToolStrip owner, ToolStripItem[] value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.ArgumentOutOfRangeException, system.FormatException, system.NotImplementedException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.NotSupportedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.RankException, system.MulticastNotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(owner == null ? null : owner.getJCOInstance(), toObjectFromArray(value)));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public ToolStripItem Add(java.lang.String text) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.MulticastNotSupportedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", text);
            return new ToolStripItem(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripItem Add(Image image) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.MulticastNotSupportedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", image == null ? null : image.getJCOInstance());
            return new ToolStripItem(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripItem Add(java.lang.String text, Image image) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.MulticastNotSupportedException, system.RankException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", text, image == null ? null : image.getJCOInstance());
            return new ToolStripItem(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripItem Add(java.lang.String text, Image image, EventHandler onClick) throws Throwable, system.ArgumentNullException, system.configuration.ConfigurationErrorsException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.security.SecurityException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.NullReferenceException, system.MulticastNotSupportedException, system.RankException, system.threading.ThreadStateException, system.componentmodel.Win32Exception, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objAdd = (JCObject)classInstance.Invoke("Add", text, image == null ? null : image.getJCOInstance(), onClick);
            return new ToolStripItem(objAdd);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int Add(ToolStripItem value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.RankException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("Add", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddRange(ToolStripItem[] toolStripItems) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.RankException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddRange", (Object)toObjectFromArray(toolStripItems));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddRange(ToolStripItemCollection toolStripItems) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.RankException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddRange", toolStripItems == null ? null : toolStripItems.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Contains(ToolStripItem value) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Contains", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean ContainsKey(java.lang.String key) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("ContainsKey", key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Insert(int index, ToolStripItem value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.RankException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Insert", index, value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexOf(ToolStripItem value) throws Throwable, system.ArgumentNullException, system.RankException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("IndexOf", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexOfKey(java.lang.String key) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.OutOfMemoryException, system.ArgumentException, system.IndexOutOfRangeException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.globalization.CultureNotFoundException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("IndexOfKey", key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Remove(ToolStripItem value) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.RankException, system.configuration.ConfigurationErrorsException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Remove", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAt(int index) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.OverflowException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveAt", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveByKey(java.lang.String key) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.configuration.ConfigurationErrorsException, system.MulticastNotSupportedException, system.threading.ThreadStateException, system.componentmodel.Win32Exception, system.OutOfMemoryException, system.IndexOutOfRangeException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveByKey", key);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(ToolStripItem[] array, int index) throws Throwable, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CopyTo", toObjectFromArray(array), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ToolStripItem[] Find(java.lang.String key, boolean searchAllChildren) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<ToolStripItem> resultingArrayList = new ArrayList<ToolStripItem>();
            JCObject resultingObjects = (JCObject)classInstance.Invoke("Find", key, searchAllChildren);
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new ToolStripItem(resultingObject));
            }
            ToolStripItem[] resultingArray = new ToolStripItem[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(Array array, int index) throws Throwable, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CopyTo", array == null ? null : array.getJCOInstance(), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getIsReadOnly() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsReadOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getCount() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("Count");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}