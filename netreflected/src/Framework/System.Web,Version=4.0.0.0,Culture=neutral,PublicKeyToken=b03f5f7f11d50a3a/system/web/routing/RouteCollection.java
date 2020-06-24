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

package system.web.routing;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.hosting.VirtualPathProvider;
import system.web.routing.RouteBase;
import system.IDisposable;
import system.IDisposableImplementation;
import system.web.routing.Route;
import system.web.routing.RouteValueDictionary;
import system.web.routing.RouteData;
import system.web.HttpContextBase;
import system.web.routing.VirtualPathData;
import system.web.routing.RequestContext;


/**
 * The base .NET class managing System.Web.Routing.RouteCollection, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class RouteCollection extends NetObject  {
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    public static final String assemblyShortName = "System.Web";
    public static final String className = "System.Web.Routing.RouteCollection";
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

    public RouteCollection(Object instance) throws Throwable {
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

    public static RouteCollection cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new RouteCollection(from.getJCOInstance());
    }

    // Constructors section
    

    public RouteCollection() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RouteCollection(VirtualPathProvider virtualPathProvider) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(virtualPathProvider == null ? null : virtualPathProvider.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public boolean Contains(RouteBase item) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Contains", item == null ? null : item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Remove(RouteBase item) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Invoke("Remove", item == null ? null : item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int IndexOf(RouteBase item) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Invoke("IndexOf", item == null ? null : item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDisposable GetReadLock() throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetReadLock = (JCObject)classInstance.Invoke("GetReadLock");
            return new IDisposableImplementation(objGetReadLock);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public IDisposable GetWriteLock() throws Throwable, system.ArgumentOutOfRangeException, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.InvalidOperationException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetWriteLock = (JCObject)classInstance.Invoke("GetWriteLock");
            return new IDisposableImplementation(objGetWriteLock);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Route MapPageRoute(java.lang.String routeName, java.lang.String routeUrl, java.lang.String physicalFile) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.OutOfMemoryException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMapPageRoute = (JCObject)classInstance.Invoke("MapPageRoute", routeName, routeUrl, physicalFile);
            return new Route(objMapPageRoute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Route MapPageRoute(java.lang.String routeName, java.lang.String routeUrl, java.lang.String physicalFile, boolean checkPhysicalUrlAccess) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.OutOfMemoryException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMapPageRoute = (JCObject)classInstance.Invoke("MapPageRoute", routeName, routeUrl, physicalFile, checkPhysicalUrlAccess);
            return new Route(objMapPageRoute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Route MapPageRoute(java.lang.String routeName, java.lang.String routeUrl, java.lang.String physicalFile, boolean checkPhysicalUrlAccess, RouteValueDictionary defaults) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.OutOfMemoryException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMapPageRoute = (JCObject)classInstance.Invoke("MapPageRoute", routeName, routeUrl, physicalFile, checkPhysicalUrlAccess, defaults == null ? null : defaults.getJCOInstance());
            return new Route(objMapPageRoute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Route MapPageRoute(java.lang.String routeName, java.lang.String routeUrl, java.lang.String physicalFile, boolean checkPhysicalUrlAccess, RouteValueDictionary defaults, RouteValueDictionary constraints) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.NotSupportedException, system.security.SecurityException, system.io.IOException, system.OutOfMemoryException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMapPageRoute = (JCObject)classInstance.Invoke("MapPageRoute", routeName, routeUrl, physicalFile, checkPhysicalUrlAccess, defaults == null ? null : defaults.getJCOInstance(), constraints == null ? null : constraints.getJCOInstance());
            return new Route(objMapPageRoute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Route MapPageRoute(java.lang.String routeName, java.lang.String routeUrl, java.lang.String physicalFile, boolean checkPhysicalUrlAccess, RouteValueDictionary defaults, RouteValueDictionary constraints, RouteValueDictionary dataTokens) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.FormatException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.OutOfMemoryException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objMapPageRoute = (JCObject)classInstance.Invoke("MapPageRoute", routeName, routeUrl, physicalFile, checkPhysicalUrlAccess, defaults == null ? null : defaults.getJCOInstance(), constraints == null ? null : constraints.getJCOInstance(), dataTokens == null ? null : dataTokens.getJCOInstance());
            return new Route(objMapPageRoute);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RouteData GetRouteData(HttpContextBase httpContext) throws Throwable, system.ArgumentNullException, system.NotImplementedException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetRouteData = (JCObject)classInstance.Invoke("GetRouteData", httpContext == null ? null : httpContext.getJCOInstance());
            return new RouteData(objGetRouteData);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VirtualPathData GetVirtualPath(RequestContext requestContext, java.lang.String name, RouteValueDictionary values) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetVirtualPath = (JCObject)classInstance.Invoke("GetVirtualPath", requestContext == null ? null : requestContext.getJCOInstance(), name, values == null ? null : values.getJCOInstance());
            return new VirtualPathData(objGetVirtualPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public VirtualPathData GetVirtualPath(RequestContext requestContext, RouteValueDictionary values) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.LockRecursionException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetVirtualPath = (JCObject)classInstance.Invoke("GetVirtualPath", requestContext == null ? null : requestContext.getJCOInstance(), values == null ? null : values.getJCOInstance());
            return new VirtualPathData(objGetVirtualPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Add(java.lang.String name, RouteBase item) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.threading.AbandonedMutexException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.OutOfMemoryException, system.diagnostics.tracing.EventSourceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Add", name, item == null ? null : item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Add(RouteBase item) throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Add", item == null ? null : item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Clear() throws Throwable, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Clear");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void CopyTo(RouteBase[] array, int index) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("CopyTo", toObjectFromArray(array), index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Ignore(java.lang.String url) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.RankException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Ignore", url);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Ignore(java.lang.String url, NetObject constraints) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException, system.IndexOutOfRangeException, system.RankException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Ignore", url, constraints == null ? null : constraints.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void Insert(int index, RouteBase item) throws Throwable, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Insert", index, item == null ? null : item.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void RemoveAt(int index) throws Throwable, system.NotSupportedException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("RemoveAt", index);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAppendTrailingSlash() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("AppendTrailingSlash");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAppendTrailingSlash(boolean AppendTrailingSlash) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AppendTrailingSlash", AppendTrailingSlash);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLowercaseUrls() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("LowercaseUrls");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLowercaseUrls(boolean LowercaseUrls) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LowercaseUrls", LowercaseUrls);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRouteExistingFiles() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("RouteExistingFiles");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRouteExistingFiles(boolean RouteExistingFiles) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("RouteExistingFiles", RouteExistingFiles);
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