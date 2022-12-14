/*
 *  Copyright 2022 Yury Kharchenko
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.mascotcapsule.micro3d.v3;

import java.nio.Buffer;

class TextureData {
	private final Buffer raster;
	final int width;
	final int height;

	TextureData(Buffer raster, int width, int height) {
		this.raster = raster;
		this.width = width;
		this.height = height;
	}

	Buffer getRaster() {
		return raster.rewind();
	}
}
