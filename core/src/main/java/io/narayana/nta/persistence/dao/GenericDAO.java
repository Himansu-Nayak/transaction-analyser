/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package io.narayana.nta.persistence.dao;

import javax.ejb.Local;
import java.io.Serializable;
import java.util.List;

/**
 * @Author Alex Creasy &lt;a.r.creasy@newcastle.ac.uk$gt;
 * Date: 07/05/2013
 * Time: 22:35
 */
@Local
public interface GenericDAO extends Serializable {

    <E> void create(E entity);

    <E, K> E retrieve(Class<E> entityClass, K primaryKey);

    @SuppressWarnings("unchecked")
    <E> List<E> retrieveAll(Class<E> entityClass);

    @SuppressWarnings("unchecked")
    <E, V> E retrieveSingleByField(Class<E> entityClass, String field, V value);

    <E> E update(E entity);

    <E> void delete(E entity);

    <E> void deleteAll(Class<E> entityClass);

    void deleteAll();

    <E> E querySingle(Class<E> entityType, String query);

    <E> List<E> queryMultiple(Class<E> entityType, String query);

    <E, V> List<E> retrieveMultipleByField(Class<E> entityClass, String field, V value);
}
