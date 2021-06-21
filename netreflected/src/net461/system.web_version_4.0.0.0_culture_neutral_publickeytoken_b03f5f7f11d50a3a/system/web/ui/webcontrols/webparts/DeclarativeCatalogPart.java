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

package system.web.ui.webcontrols.webparts;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.web.ui.webcontrols.webparts.CatalogPart;
import system.web.ui.webcontrols.webparts.WebPart;
import system.web.ui.webcontrols.webparts.WebPartDescription;
import system.web.ui.webcontrols.webparts.WebPartDescriptionCollection;
import system.drawing.Color;
import system.web.ui.ITemplate;
import system.web.ui.ITemplateImplementation;
import system.web.ui.webcontrols.BorderStyle;
import system.web.ui.webcontrols.ContentDirection;
import system.web.ui.webcontrols.FontInfo;
import system.web.ui.webcontrols.HorizontalAlign;
import system.web.ui.webcontrols.ScrollBars;
import system.web.ui.webcontrols.Unit;


/**
 * The base .NET class managing System.Web.UI.WebControls.WebParts.DeclarativeCatalogPart, System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Web.UI.WebControls.WebParts.DeclarativeCatalogPart" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Web.UI.WebControls.WebParts.DeclarativeCatalogPart</a>
 */
public class DeclarativeCatalogPart extends CatalogPart  {
    /**
     * Fully assembly qualified name: System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.Web, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.Web
     */
    public static final String assemblyShortName = "System.Web";
    /**
     * Qualified class name: System.Web.UI.WebControls.WebParts.DeclarativeCatalogPart
     */
    public static final String className = "System.Web.UI.WebControls.WebParts.DeclarativeCatalogPart";
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

    public DeclarativeCatalogPart(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DeclarativeCatalogPart}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link DeclarativeCatalogPart} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DeclarativeCatalogPart cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DeclarativeCatalogPart(from.getJCOInstance());
    }

    // Constructors section
    
    public DeclarativeCatalogPart() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public WebPart GetWebPart(WebPartDescription description) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetWebPart = (JCObject)classInstance.Invoke("GetWebPart", description == null ? null : description.getJCOInstance());
            return new WebPart(objGetWebPart);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public WebPartDescriptionCollection GetAvailableWebPartDescriptions() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.globalization.CultureNotFoundException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.web.HttpException, system.FormatException, system.OutOfMemoryException, system.web.HttpRequestValidationException, system.web.HttpCompileException, system.NotSupportedException, system.MissingMethodException, system.security.SecurityException, system.NullReferenceException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAvailableWebPartDescriptions = (JCObject)classInstance.Invoke("GetAvailableWebPartDescriptions");
            return new WebPartDescriptionCollection(objGetAvailableWebPartDescriptions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public java.lang.String getWebPartsListUserControlPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("WebPartsListUserControlPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWebPartsListUserControlPath(java.lang.String WebPartsListUserControlPath) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("WebPartsListUserControlPath", WebPartsListUserControlPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ITemplate getWebPartsTemplate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("WebPartsTemplate");
            return new ITemplateImplementation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setWebPartsTemplate(ITemplate WebPartsTemplate) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("WebPartsTemplate", WebPartsTemplate == null ? null : WebPartsTemplate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}