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

package system.data.common.commandtrees;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.data.common.commandtrees.DbExpression;
import system.data.common.commandtrees.DbAndExpression;
import system.data.common.commandtrees.DbApplyExpression;
import system.data.common.commandtrees.DbArithmeticExpression;
import system.data.common.commandtrees.DbCaseExpression;
import system.data.common.commandtrees.DbCastExpression;
import system.data.common.commandtrees.DbComparisonExpression;
import system.data.common.commandtrees.DbConstantExpression;
import system.data.common.commandtrees.DbCrossJoinExpression;
import system.data.common.commandtrees.DbDerefExpression;
import system.data.common.commandtrees.DbDistinctExpression;
import system.data.common.commandtrees.DbElementExpression;
import system.data.common.commandtrees.DbEntityRefExpression;
import system.data.common.commandtrees.DbExceptExpression;
import system.data.common.commandtrees.DbFilterExpression;
import system.data.common.commandtrees.DbFunctionExpression;
import system.data.common.commandtrees.DbGroupByExpression;
import system.data.common.commandtrees.DbIntersectExpression;
import system.data.common.commandtrees.DbIsEmptyExpression;
import system.data.common.commandtrees.DbIsNullExpression;
import system.data.common.commandtrees.DbIsOfExpression;
import system.data.common.commandtrees.DbJoinExpression;
import system.data.common.commandtrees.DbLambdaExpression;
import system.data.common.commandtrees.DbLikeExpression;
import system.data.common.commandtrees.DbLimitExpression;
import system.data.common.commandtrees.DbNewInstanceExpression;
import system.data.common.commandtrees.DbNotExpression;
import system.data.common.commandtrees.DbNullExpression;
import system.data.common.commandtrees.DbOfTypeExpression;
import system.data.common.commandtrees.DbOrExpression;
import system.data.common.commandtrees.DbParameterReferenceExpression;
import system.data.common.commandtrees.DbProjectExpression;
import system.data.common.commandtrees.DbPropertyExpression;
import system.data.common.commandtrees.DbQuantifierExpression;
import system.data.common.commandtrees.DbRefExpression;
import system.data.common.commandtrees.DbRefKeyExpression;
import system.data.common.commandtrees.DbRelationshipNavigationExpression;
import system.data.common.commandtrees.DbScanExpression;
import system.data.common.commandtrees.DbSkipExpression;
import system.data.common.commandtrees.DbSortExpression;
import system.data.common.commandtrees.DbTreatExpression;
import system.data.common.commandtrees.DbUnionAllExpression;
import system.data.common.commandtrees.DbVariableReferenceExpression;


/**
 * The base .NET class managing System.Data.Common.CommandTrees.DefaultExpressionVisitor, System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class DefaultExpressionVisitor extends NetObject  {
    public static final String assemblyFullName = "System.Data.Entity, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    public static final String assemblyShortName = "System.Data.Entity";
    public static final String className = "System.Data.Common.CommandTrees.DefaultExpressionVisitor";
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

    public DefaultExpressionVisitor(Object instance) throws Throwable {
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

    public static DefaultExpressionVisitor cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DefaultExpressionVisitor(from.getJCOInstance());
    }

    // Constructors section
    

    
    // Methods section
    
    public DbExpression Visit(DbAndExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbApplyExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbArithmeticExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbCaseExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.ArgumentException, system.NotSupportedException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbCastExpression expression) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbComparisonExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbConstantExpression expression) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.NotSupportedException, system.InvalidCastException, system.ArgumentOutOfRangeException, system.NullReferenceException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbCrossJoinExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbDerefExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbDistinctExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbElementExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbEntityRefExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbExceptExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotImplementedException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.IndexOutOfRangeException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbFilterExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbFunctionExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.OutOfMemoryException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbGroupByExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbIntersectExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbIsEmptyExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbIsNullExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbIsOfExpression expression) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbJoinExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbLambdaExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbLikeExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.ArgumentException, system.InvalidOperationException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbLimitExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbNewInstanceExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.data.ProviderIncompatibleException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbNotExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbNullExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbOfTypeExpression expression) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbOrExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbParameterReferenceExpression expression) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.InvalidOperationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbProjectExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbPropertyExpression expression) throws Throwable, system.ArgumentNullException, system.InvalidOperationException, system.ArgumentException, system.data.ProviderIncompatibleException, system.ArgumentOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbQuantifierExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbRefExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.data.ProviderIncompatibleException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbRefKeyExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.data.ProviderIncompatibleException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbRelationshipNavigationExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbScanExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbSkipExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbSortExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.NotSupportedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbTreatExpression expression) throws Throwable, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbUnionAllExpression expression) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.resources.MissingManifestResourceException, system.NotImplementedException, system.ObjectDisposedException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DbExpression Visit(DbVariableReferenceExpression expression) throws Throwable, system.ArgumentNullException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objVisit = (JCObject)classInstance.Invoke("Visit", expression == null ? null : expression.getJCOInstance());
            return new DbExpression(objVisit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}