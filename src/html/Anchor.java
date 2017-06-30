/**

 oxdoc (c) Copyright 2005-2014 by Y. Zwols

 This library is free software; you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public
 License as published by the Free Software Foundation; either
 version 2.1 of the License, or (at your option) any later version.

 This library is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public
 License along with this library; if not, write to the Free Software
 Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

 **/

package oxdoc.html;

import static oxdoc.util.Utils.checkNotNull;

public class Anchor extends Element {

  private final String name;

  public Anchor(String name) {
    this.name = checkNotNull(name);
  }

  @Override
  protected void render(StringBuilder buffer) {
    buffer.append("<a name=\"");
    buffer.append(name);
    buffer.append("\"></a>");
  }
}