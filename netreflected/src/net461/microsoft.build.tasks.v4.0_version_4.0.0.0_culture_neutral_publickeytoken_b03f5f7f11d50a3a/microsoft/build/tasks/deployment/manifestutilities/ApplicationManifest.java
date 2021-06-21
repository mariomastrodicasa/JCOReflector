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

package microsoft.build.tasks.deployment.manifestutilities;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import microsoft.build.tasks.deployment.manifestutilities.AssemblyManifest;
import microsoft.build.tasks.deployment.manifestutilities.AssemblyIdentity;
import microsoft.build.tasks.deployment.manifestutilities.AssemblyReference;
import microsoft.build.tasks.deployment.manifestutilities.FileAssociation;
import microsoft.build.tasks.deployment.manifestutilities.FileAssociationCollection;
import microsoft.build.tasks.deployment.manifestutilities.TrustInfo;


/**
 * The base .NET class managing Microsoft.Build.Tasks.Deployment.ManifestUtilities.ApplicationManifest, Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Deployment.ManifestUtilities.ApplicationManifest" target="_top">https://docs.microsoft.com/en-us/dotnet/api/Microsoft.Build.Tasks.Deployment.ManifestUtilities.ApplicationManifest</a>
 */
public class ApplicationManifest extends AssemblyManifest  {
    /**
     * Fully assembly qualified name: Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "Microsoft.Build.Tasks.v4.0, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: Microsoft.Build.Tasks.v4.0
     */
    public static final String assemblyShortName = "Microsoft.Build.Tasks.v4.0";
    /**
     * Qualified class name: Microsoft.Build.Tasks.Deployment.ManifestUtilities.ApplicationManifest
     */
    public static final String className = "Microsoft.Build.Tasks.Deployment.ManifestUtilities.ApplicationManifest";
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

    public ApplicationManifest(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link ApplicationManifest}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link ApplicationManifest} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static ApplicationManifest cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new ApplicationManifest(from.getJCOInstance());
    }

    // Constructors section
    
    public ApplicationManifest() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ApplicationManifest(java.lang.String targetFrameworkVersion) throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOReflector.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(targetFrameworkVersion));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public void Validate() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NullReferenceException, system.xml.XmlException, system.xml.xpath.XPathException, system.FormatException, system.IndexOutOfRangeException, system.NotSupportedException, system.security.SecurityException, system.UnauthorizedAccessException, system.io.IOException, system.xml.schema.XmlSchemaException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.BadImageFormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("Validate");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getHostInBrowser() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("HostInBrowser");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHostInBrowser(boolean HostInBrowser) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HostInBrowser", HostInBrowser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsClickOnceManifest() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IsClickOnceManifest");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIsClickOnceManifest(boolean IsClickOnceManifest) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IsClickOnceManifest", IsClickOnceManifest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseApplicationTrust() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseApplicationTrust");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseApplicationTrust(boolean UseApplicationTrust) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UseApplicationTrust", UseApplicationTrust);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getMaxTargetPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("MaxTargetPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMaxTargetPath(int MaxTargetPath) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("MaxTargetPath", MaxTargetPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AssemblyIdentity getXmlEntryPointIdentity() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("XmlEntryPointIdentity");
            return new AssemblyIdentity(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlEntryPointIdentity(AssemblyIdentity XmlEntryPointIdentity) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlEntryPointIdentity", XmlEntryPointIdentity == null ? null : XmlEntryPointIdentity.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public final FileAssociation[] getXmlFileAssociations() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            ArrayList<FileAssociation> resultingArrayList = new ArrayList<FileAssociation>();
            JCObject resultingObjects = (JCObject)classInstance.Get("XmlFileAssociations");
            for (Object resultingObject : resultingObjects) {
			    resultingArrayList.add(new FileAssociation(resultingObject));
            }
            FileAssociation[] resultingArray = new FileAssociation[resultingArrayList.size()];
            resultingArray = resultingArrayList.toArray(resultingArray);
            return resultingArray;
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlFileAssociations(FileAssociation[] XmlFileAssociations) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlFileAssociations", toObjectFromArray(XmlFileAssociations));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public FileAssociationCollection getFileAssociations() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("FileAssociations");
            return new FileAssociationCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TrustInfo getTrustInfo() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("TrustInfo");
            return new TrustInfo(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTrustInfo(TrustInfo TrustInfo) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TrustInfo", TrustInfo == null ? null : TrustInfo.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getConfigFile() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ConfigFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setConfigFile(java.lang.String ConfigFile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ConfigFile", ConfigFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getErrorReportUrl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("ErrorReportUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setErrorReportUrl(java.lang.String ErrorReportUrl) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ErrorReportUrl", ErrorReportUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getIconFile() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("IconFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIconFile(java.lang.String IconFile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IconFile", IconFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOSDescription() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("OSDescription");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOSDescription(java.lang.String OSDescription) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OSDescription", OSDescription);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOSSupportUrl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("OSSupportUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOSSupportUrl(java.lang.String OSSupportUrl) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OSSupportUrl", OSSupportUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getOSVersion() throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.FormatException, system.OverflowException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("OSVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOSVersion(java.lang.String OSVersion) throws Throwable, system.ArgumentNullException, system.FormatException, system.OverflowException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OSVersion", OSVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getProduct() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Product");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setProduct(java.lang.String Product) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Product", Product);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getPublisher() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Publisher");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPublisher(java.lang.String Publisher) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Publisher", Publisher);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSuiteName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SuiteName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSuiteName(java.lang.String SuiteName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SuiteName", SuiteName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getSupportUrl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("SupportUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSupportUrl(java.lang.String SupportUrl) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SupportUrl", SupportUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTargetFrameworkVersion() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("TargetFrameworkVersion");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTargetFrameworkVersion(java.lang.String TargetFrameworkVersion) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("TargetFrameworkVersion", TargetFrameworkVersion);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlConfigFile() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlConfigFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlConfigFile(java.lang.String XmlConfigFile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlConfigFile", XmlConfigFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlEntryPointParameters() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlEntryPointParameters");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlEntryPointParameters(java.lang.String XmlEntryPointParameters) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlEntryPointParameters", XmlEntryPointParameters);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlEntryPointPath() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlEntryPointPath");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlEntryPointPath(java.lang.String XmlEntryPointPath) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlEntryPointPath", XmlEntryPointPath);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlErrorReportUrl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlErrorReportUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlErrorReportUrl(java.lang.String XmlErrorReportUrl) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlErrorReportUrl", XmlErrorReportUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlHostInBrowser() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlHostInBrowser");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlHostInBrowser(java.lang.String XmlHostInBrowser) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlHostInBrowser", XmlHostInBrowser);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlIconFile() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlIconFile");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlIconFile(java.lang.String XmlIconFile) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlIconFile", XmlIconFile);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlIsClickOnceManifest() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlIsClickOnceManifest");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlIsClickOnceManifest(java.lang.String XmlIsClickOnceManifest) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlIsClickOnceManifest", XmlIsClickOnceManifest);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlOSBuild() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlOSBuild");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlOSBuild(java.lang.String XmlOSBuild) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlOSBuild", XmlOSBuild);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlOSDescription() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlOSDescription");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlOSDescription(java.lang.String XmlOSDescription) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlOSDescription", XmlOSDescription);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlOSMajor() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlOSMajor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlOSMajor(java.lang.String XmlOSMajor) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlOSMajor", XmlOSMajor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlOSMinor() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlOSMinor");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlOSMinor(java.lang.String XmlOSMinor) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlOSMinor", XmlOSMinor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlOSRevision() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlOSRevision");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlOSRevision(java.lang.String XmlOSRevision) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlOSRevision", XmlOSRevision);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlOSSupportUrl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlOSSupportUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlOSSupportUrl(java.lang.String XmlOSSupportUrl) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlOSSupportUrl", XmlOSSupportUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlProduct() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlProduct");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlProduct(java.lang.String XmlProduct) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlProduct", XmlProduct);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlPublisher() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlPublisher");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlPublisher(java.lang.String XmlPublisher) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlPublisher", XmlPublisher);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlSuiteName() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlSuiteName");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlSuiteName(java.lang.String XmlSuiteName) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlSuiteName", XmlSuiteName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlSupportUrl() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlSupportUrl");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlSupportUrl(java.lang.String XmlSupportUrl) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlSupportUrl", XmlSupportUrl);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getXmlUseApplicationTrust() throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.IndexOutOfRangeException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("XmlUseApplicationTrust");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setXmlUseApplicationTrust(java.lang.String XmlUseApplicationTrust) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.FormatException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("XmlUseApplicationTrust", XmlUseApplicationTrust);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}