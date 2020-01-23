package com.ethlo.keyvalue;

/*-
 * #%L
 * Key/Value API
 * %%
 * Copyright (C) 2013 - 2020 Morten Haraldsen (ethlo)
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.io.Closeable;
import java.util.Map.Entry;

/**
 * 
 * @author mha
 */
public interface SeekableIterator<K,V> extends Closeable
{
	void seekToFirst();

	boolean hasNext();
	
	Entry<K,V> next();
	
	boolean hasPrevious();
	
	Entry<K,V> previous();
	
	void seekTo(K key);

	void close();
	
	void seekToLast();
}