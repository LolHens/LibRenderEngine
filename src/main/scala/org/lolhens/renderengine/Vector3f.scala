package org.lolhens.renderengine

/**
 * Created by LolHens on 05.10.2014.
 */
class Vector3f(val x: Float, val y: Float, val z: Float) {
  def +(vec: Vector3f): Vector3f = new Vector3f(x + vec.x, y + vec.y, z + vec.z)

  def -(vec: Vector3f): Vector3f = new Vector3f(x - vec.x, y - vec.y, z - vec.z)

  def *(vec: Vector3f): Vector3f = new Vector3f(x * vec.x, y * vec.y, z * vec.z)

  def /(vec: Vector3f): Vector3f = new Vector3f(x / vec.x, y / vec.y, z / vec.z)

  def max(vec: Vector3f): Vector3f = new Vector3f(if (vec.x > x) vec.x else x, if (vec.y > y) vec.y else y, if (vec.z > z) vec.z else z)

  def min(vec: Vector3f): Vector3f = new Vector3f(if (vec.x < x) vec.x else x, if (vec.y < y) vec.y else y, if (vec.z < z) vec.z else z)
}

object NullVector3f extends Vector3f(0, 0, 0) {}