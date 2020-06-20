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

package system.servicemodel.syndication;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Uri;
import system.DateTimeOffset;
import system.servicemodel.syndication.SyndicationContent;
import system.servicemodel.syndication.SyndicationItem;
import system.xml.XmlReader;
import system.servicemodel.syndication.Atom10ItemFormatter;
import system.servicemodel.syndication.Rss20ItemFormatter;
import system.xml.XmlWriter;
import system.servicemodel.syndication.TextSyndicationContent;
import system.servicemodel.syndication.SyndicationElementExtensionCollection;
import system.servicemodel.syndication.SyndicationFeed;


/**
 * The base .NET class managing System.ServiceModel.Syndication.SyndicationItem, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class SyndicationItem extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Syndication.SyndicationItem";
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

    public SyndicationItem(Object instance) throws Throwable {
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

    public static SyndicationItem cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new SyndicationItem(from.getJCOInstance());
    }

    // Constructors section
    

    public SyndicationItem() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SyndicationItem(java.lang.String title, java.lang.String content, Uri itemAlternateLink) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(title, content, itemAlternateLink == null ? null : itemAlternateLink.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SyndicationItem(java.lang.String title, java.lang.String content, Uri itemAlternateLink, java.lang.String id, DateTimeOffset lastUpdatedTime) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(title, content, itemAlternateLink == null ? null : itemAlternateLink.getJCOInstance(), id, lastUpdatedTime == null ? null : lastUpdatedTime.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SyndicationItem(java.lang.String title, SyndicationContent content, Uri itemAlternateLink, java.lang.String id, DateTimeOffset lastUpdatedTime) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.NotSupportedException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(title, content == null ? null : content.getJCOInstance(), itemAlternateLink == null ? null : itemAlternateLink.getJCOInstance(), id, lastUpdatedTime == null ? null : lastUpdatedTime.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public static SyndicationItem Load(XmlReader reader) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objLoad = (JCObject)classType.Invoke("Load", reader == null ? null : reader.getJCOInstance());
            return new SyndicationItem(objLoad);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SyndicationItem Clone() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.MulticastNotSupportedException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.configuration.ConfigurationErrorsException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.collections.generic.KeyNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new SyndicationItem(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void AddPermalink(Uri permalink) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.FormatException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.OverflowException, system.OutOfMemoryException, system.UriFormatException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("AddPermalink", permalink == null ? null : permalink.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Atom10ItemFormatter GetAtom10Formatter() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetAtom10Formatter = (JCObject)classInstance.Invoke("GetAtom10Formatter");
            return new Atom10ItemFormatter(objGetAtom10Formatter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rss20ItemFormatter GetRss20Formatter() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetRss20Formatter = (JCObject)classInstance.Invoke("GetRss20Formatter");
            return new Rss20ItemFormatter(objGetRss20Formatter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rss20ItemFormatter GetRss20Formatter(boolean serializeExtensionsAsAtom) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objGetRss20Formatter = (JCObject)classInstance.Invoke("GetRss20Formatter", serializeExtensionsAsAtom);
            return new Rss20ItemFormatter(objGetRss20Formatter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveAsAtom10(XmlWriter writer) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.OutOfMemoryException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SaveAsAtom10", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SaveAsRss20(XmlWriter writer) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.OutOfMemoryException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Invoke("SaveAsRss20", writer == null ? null : writer.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public Uri getBaseUri() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("BaseUri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setBaseUri(Uri BaseUri) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("BaseUri", BaseUri == null ? null : BaseUri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SyndicationContent getContent() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Content");
            return new SyndicationContent(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setContent(SyndicationContent Content) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Content", Content == null ? null : Content.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextSyndicationContent getCopyright() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Copyright");
            return new TextSyndicationContent(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCopyright(TextSyndicationContent Copyright) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Copyright", Copyright == null ? null : Copyright.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SyndicationElementExtensionCollection getElementExtensions() throws Throwable, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.xml.XmlException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ElementExtensions");
            return new SyndicationElementExtensionCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getId() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Id");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setId(java.lang.String Id) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Id", Id);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeOffset getLastUpdatedTime() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("LastUpdatedTime");
            return new DateTimeOffset(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLastUpdatedTime(DateTimeOffset LastUpdatedTime) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("LastUpdatedTime", LastUpdatedTime == null ? null : LastUpdatedTime.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DateTimeOffset getPublishDate() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PublishDate");
            return new DateTimeOffset(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPublishDate(DateTimeOffset PublishDate) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PublishDate", PublishDate == null ? null : PublishDate.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SyndicationFeed getSourceFeed() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SourceFeed");
            return new SyndicationFeed(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSourceFeed(SyndicationFeed SourceFeed) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SourceFeed", SourceFeed == null ? null : SourceFeed.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextSyndicationContent getSummary() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Summary");
            return new TextSyndicationContent(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSummary(TextSyndicationContent Summary) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Summary", Summary == null ? null : Summary.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TextSyndicationContent getTitle() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Title");
            return new TextSyndicationContent(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTitle(TextSyndicationContent Title) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Title", Title == null ? null : Title.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}