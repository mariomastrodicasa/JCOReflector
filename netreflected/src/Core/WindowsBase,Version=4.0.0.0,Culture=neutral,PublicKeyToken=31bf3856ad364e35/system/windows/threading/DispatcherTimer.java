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

package system.windows.threading;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.threading.DispatcherPriority;
import system.windows.threading.Dispatcher;
import system.TimeSpan;
import system.EventHandler;


/**
 * The base .NET class managing System.Windows.Threading.DispatcherTimer, WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 */
public class DispatcherTimer extends NetObject  {
    public static final String assemblyFullName = "WindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    public static final String assemblyShortName = "WindowsBase";
    public static final String className = "System.Windows.Threading.DispatcherTimer";
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

    public DispatcherTimer(Object instance) throws Throwable {
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

    public static DispatcherTimer cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DispatcherTimer(from.getJCOInstance());
    }

    // Constructors section
    

    public DispatcherTimer() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.OverflowException, system.TimeoutException, system.PlatformNotSupportedException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DispatcherTimer(DispatcherPriority priority) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.OverflowException, system.TimeoutException, system.PlatformNotSupportedException, system.InvalidCastException, system.ObjectDisposedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(priority == null ? null : priority.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DispatcherTimer(DispatcherPriority priority, Dispatcher dispatcher) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.OverflowException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(priority == null ? null : priority.getJCOInstance(), dispatcher == null ? null : dispatcher.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DispatcherTimer(TimeSpan interval, DispatcherPriority priority, EventHandler callback, Dispatcher dispatcher) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException, system.componentmodel.Win32Exception {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(interval == null ? null : interval.getJCOInstance(), priority == null ? null : priority.getJCOInstance(), callback, dispatcher == null ? null : dispatcher.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public void Stop() throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidCastException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Stop");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Start() throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.threading.SynchronizationLockException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Start");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public Dispatcher getDispatcher() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Dispatcher");
            return new Dispatcher(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsEnabled() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsEnabled");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsEnabled(boolean IsEnabled) throws Throwable, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidCastException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsEnabled", IsEnabled);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getInterval() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Interval");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInterval(TimeSpan Interval) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.Win32Exception, system.componentmodel.InvalidEnumArgumentException, system.PlatformNotSupportedException, system.threading.SynchronizationLockException, system.MulticastNotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Interval", Interval == null ? null : Interval.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public NetObject getTag() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Tag");
            return new NetObject(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTag(NetObject Tag) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Tag", Tag == null ? null : Tag.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

    public void addTick(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.RegisterEventListener("Tick", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeTick(EventHandler handler) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.UnregisterEventListener("Tick", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}